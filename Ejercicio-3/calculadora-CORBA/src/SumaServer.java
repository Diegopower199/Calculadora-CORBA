
import sumaApp.*;
import org.omg.CosNaming.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;

class SumaImpl extends sumaPOA {
    private ORB orb;

    public void setORB(ORB orb_val) {
        orb = orb_val;
    }

    public void shutdown() {
        orb.shutdown(false);
    }

    public double sumar(double primerNumero, double segundoNumero) {
        return primerNumero + segundoNumero;
    }

    public double restar(double primerNumero, double segundoNumero) {
        return primerNumero - segundoNumero;
    }

    public double multiplicar(double primerNumero, double segundoNumero) {
        return primerNumero + segundoNumero;
    }

    public double dividir(double primerNumero, double segundoNumero) {
        return primerNumero / segundoNumero;
    }

    public double raizCuadrada(double primerNumero) {
        return Math.sqrt(primerNumero);
    }

    public double potencia(double primerNumero, double segundoNumero) {
        return Math.pow(primerNumero, segundoNumero);
    }

    public double seno(double primerNumero) {
        return Math.sin(primerNumero);
    }

    public double coseno(double primerNumero) {
        return Math.cos(primerNumero);
    }

    public double tangente(double primerNumero) {
        return Math.tan(primerNumero);
    }

    public double logaritmoNeperiano(double primerNumero) {
        return Math.log(primerNumero);
    }

    public double logaritmoBaseDiez(double primerNumero) {
        return Math.log10(primerNumero);
    }

    public String decimalToBinario(int primerNumero) {
        return Long.toBinaryString(primerNumero);
    }

    public int binarioToDecimal(String numeroEnBinario) {
        return Integer.parseInt(numeroEnBinario, 2);
    }

}

public class SumaServer {

    public static void main(String[] args) {
        try {
            // Creamos e inicializamos el ORB
            ORB orb = ORB.init(args, null);

            // Cogemos la referencia de RootPOA y activamos el POAManager
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();

            // Creamos una instancia de sirviente con la clase HelloImpl
            // e informamos al ORB cogiendo el objeto HelloImpl llamando a la funcion setORB
            SumaImpl sumaImpl = new SumaImpl();
            sumaImpl.setORB(orb);

            // Obtenemos una referencia de objeto CORBA para un contexto de nomenclatura
            // raiz
            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(sumaImpl);
            suma href = sumaHelper.narrow(ref);

            // Cogemos la raiz Naming context y NameService invoca del nombre NameService
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // Registramos el nuevo objeto en el contexto name con el nombre de 'Suma'
            // Y vinculamos la referencia de objeto en la denominacion
            String name = "Suma";
            NameComponent path[] = ncRef.to_name(name);
            ncRef.rebind(path, href);

            System.out.println("Servidor de suma listo y en espera");

            // Esperamos a la invocacion de los cliente
            orb.run();
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
            e.printStackTrace(System.out);
        }
        System.out.println("Adios cerrando servidor");
    }
}