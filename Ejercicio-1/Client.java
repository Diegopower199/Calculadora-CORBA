import HelloApp.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;

public class Client {
    static Hello helloImpl;

    public static void main(String args[]) {
        try {
            // Creamos e inicializamos el ORB
            ORB orb = ORB.init(args, null);

            // Cogemos la raiz Naming context y NameService invoca del nombre NameService
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // Resolvemos la referencia de objeto en la denominacion
            String name = "Hello";
            helloImpl = HelloHelper.narrow(ncRef.resolve_str(name));

            // Mostramos por terminal la siguiente informacion
            System.out.println("Obtained a handle on server object: " + helloImpl);
            System.out.println(helloImpl.sayHello());

            // Se cierra el ORB
            helloImpl.shutdown();

        } catch (Exception e) {
            System.out.println("ERROR : " + e);
            e.printStackTrace(System.out);
        }
    }

}