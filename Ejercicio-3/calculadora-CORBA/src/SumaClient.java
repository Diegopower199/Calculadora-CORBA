
import java.util.Scanner;
import sumaApp.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;

public class SumaClient {
    static suma sumaImpl;

    public static void main(String args[]) {
        try {
            // Creamos e inicializamos el ORB
            ORB orb = ORB.init(args, null);

            // Cogemos la raiz Naming context y NameService invoca del nombre NameService
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // Resolvemos la referencia de objeto en la denominacion
            String name = "Suma";
            sumaImpl = sumaHelper.narrow(ncRef.resolve_str(name));

            // Iniciamos toda la logica que tiene esta clase
            Scanner scan = new Scanner(System.in);
            int operacionSeleccionada = 0;
            double numero1 = 0.0;
            double numero2 = 0.0;
            String numeroBinario = "";
            do {
                System.out.println("0. Salir");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicacion");
                System.out.println("4. Division");
                System.out.println("5. Raiz cuadrada");
                System.out.println("6. Potencia");
                System.out.println("7. Seno");
                System.out.println("8. Coseno");
                System.out.println("9. Tangente");
                System.out.println("10. Logaritmo neperiano");
                System.out.println("11. logaritmo en base 10");
                System.out.println("12. Decimal a binario");
                System.out.println("13. Binario a decimal");
                try {
                    System.out.println("¿Que opcion eliges?: ");
                    operacionSeleccionada = scan.nextInt();
                    scan.nextLine();

                    switch (operacionSeleccionada) {
                        case 0: {
                            System.out.println("Adios");
                            break;
                        }
                        case 1: {
                            System.out.println("Introduce el primer numero");
                            numero1 = scan.nextDouble();

                            System.out.println("Introduce el segundo numero");
                            numero2 = scan.nextDouble();

                            System.out
                                    .println("Resultado suma es: " + Double.toString(sumaImpl.sumar(numero1, numero2)));
                            break;
                        }
                        case 2: {
                            System.out.println("Introduce el primer numero");
                            numero1 = scan.nextDouble();

                            System.out.println("Introduce el segundo numero");
                            numero2 = scan.nextDouble();

                            System.out.println(
                                    "Resultado resta es: " + Double.toString(sumaImpl.restar(numero1, numero2)));
                            break;
                        }
                        case 3: {
                            System.out.println("Introduce el primer numero");
                            numero1 = scan.nextDouble();

                            System.out.println("Introduce el segundo numero");
                            numero2 = scan.nextDouble();

                            System.out.println("Resultado multiplicacion es: "
                                    + Double.toString(sumaImpl.multiplicar(numero1, numero2)));
                            break;
                        }
                        case 4: {
                            System.out.println("Introduce el primer numero");
                            numero1 = scan.nextDouble();

                            System.out.println("Introduce el segundo numero");
                            numero2 = scan.nextDouble();

                            System.out.println(
                                    "Resultado division es: " + Double.toString(sumaImpl.dividir(numero1, numero2)));
                            break;
                        }
                        case 5: {
                            System.out.println("Introduce el primer numero");
                            numero1 = scan.nextDouble();

                            System.out.println(
                                    "Resultado raiz cuadrada es: " + Double.toString(sumaImpl.raizCuadrada(numero1)));
                            break;
                        }
                        case 6: {
                            System.out.println("Introduce el primer numero: ");
                            numero1 = scan.nextDouble();

                            System.out.println("Introduce el segundo numero");
                            numero2 = scan.nextDouble();

                            System.out.println(
                                    "Resultado potencia es: " + Double.toString(sumaImpl.potencia(numero1, numero2)));
                            break;
                        }
                        case 7: {
                            System.out.println("Introduce el primer numero");
                            numero1 = scan.nextDouble();

                            System.out.println("Resultado seno es: " + Double.toString(sumaImpl.seno(numero1)));
                            break;
                        }
                        case 8: {
                            System.out.println("Introduce el primer numero");
                            numero1 = scan.nextDouble();

                            System.out.println("Resultado coseno es: " + Double.toString(sumaImpl.coseno(numero1)));
                            break;
                        }
                        case 9: {
                            System.out.println("Introduce el primer numero");
                            numero1 = scan.nextDouble();

                            System.out
                                    .println("Resultado  tangente es: " + Double.toString(sumaImpl.tangente(numero1)));
                            break;
                        }
                        case 10: {
                            System.out.println("Introduce el primer numero");
                            numero1 = scan.nextDouble();

                            System.out.println("Resultado logaritmo neperiano es: "
                                    + Double.toString(sumaImpl.logaritmoNeperiano(numero1)));
                            break;
                        }
                        case 11: {
                            System.out.println("Introduce el primer numero");
                            numero1 = scan.nextDouble();

                            System.out.println("Resultado logaritmo en base 10 es: "
                                    + Double.toString(sumaImpl.logaritmoBaseDiez(numero1)));
                            break;
                        }
                        case 12: {
                            System.out.println("Introduce el primer numero (entero): ");
                            numero1 = scan.nextInt();

                            System.out.println(
                                    "Resultado decimal a binario es: " + sumaImpl.decimalToBinario((int) numero1));
                            break;
                        }
                        case 13: {
                            System.out.println("Introduce el numero binario");
                            numeroBinario = scan.next();
                            System.out.println("Resultado binario a decimal es: "
                                    + Integer.toString(sumaImpl.binarioToDecimal(numeroBinario)));
                            break;
                        }
                        default: {
                            System.out.println("Esa opcion no existe");
                        }
                    }
                }

                catch (Exception e) {
                    operacionSeleccionada = 0;
                    e.printStackTrace();
                }

                System.out.println(
                        "\n\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

            } while (operacionSeleccionada != 0);

            // Se cierra el ORB
            sumaImpl.shutdown();

        } catch (Exception e) {
            System.err.println("ERROR: " + e);
            e.printStackTrace(System.out);
        }
    }
}