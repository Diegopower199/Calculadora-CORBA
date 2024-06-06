package sumaApp;

public interface sumaOperations {
    double sumar(double primerNumero, double segundoNumero);

    double restar(double primerNumero, double segundoNumero);

    double multiplicar(double primerNumero, double segundoNumero);

    double dividir(double primerNumero, double segundoNumero);

    double raizCuadrada(double primerNumero);

    double potencia(double primerNumero, double segundoNumero);

    double seno(double primerNumero);

    double coseno(double primerNumero);

    double tangente(double primerNumero);

    double logaritmoNeperiano(double primerNumero);

    double logaritmoBaseDiez(double primerNumero);

    String decimalToBinario(int primerNumero);

    int binarioToDecimal(String numeroEnBinario);

    void shutdown();
} // interface sumaOperations
