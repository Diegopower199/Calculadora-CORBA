import HelloApp.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;

import java.util.Properties;

class HelloImpl extends HelloPOA {
    private ORB orb;

    public void setORB(ORB orb_val) {
        orb = orb_val;
    }

    // implement sayHello() method
    public String sayHello() {
        return "\nHello world !!\n";
    }

    // implement shutdown() method
    public void shutdown() {
        orb.shutdown(false);
    }
}

public class Server {

    public static void main(String args[]) {
        try {
            // Creamos e inicializamos el ORB
            ORB orb = ORB.init(args, null);

            // Cogemos la referencia de RootPOA y activamos el POAManager
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();

            //
            // Creamos una instancia de sirviente con la clase HelloImpl
            // e informamos al ORB cogiendo el objeto HelloImpl llamando a la funcion setORB
            HelloImpl helloImpl = new HelloImpl();
            helloImpl.setORB(orb);

            // Obtenemos una referencia de objeto CORBA para un contexto de nomenclatura
            // raiz
            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(helloImpl);
            Hello href = HelloHelper.narrow(ref);

            // Cogemos la raiz Naming context y NameService invoca del nombre NameService
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");

            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // Registramos el nuevo objeto en el contexto name con el nombre de 'Hello'
            // Y vinculamos la referencia de objeto en la denominacion
            String name = "Hello";
            NameComponent path[] = ncRef.to_name(name);
            ncRef.rebind(path, href);

            System.out.println("HelloServer ready and waiting ...");

            // Esperamos a la invocacion de los cliente
            orb.run();
        }

        catch (Exception e) {
            System.err.println("ERROR: " + e);
            e.printStackTrace(System.out);
        }

        System.out.println("HelloServer Exiting ...");

    }
}
