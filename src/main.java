public class main {
    public static void main(String[] args) {
        ConversorMoneda conversor = new ConversorMoneda(new TasaBancoCentral());
        conversor.convertir(100, "USD", "ARS");
        conversor = new ConversorMoneda(new TasaMercadoLibre());
        conversor.convertir(100, "USD", "ARS");
    }
}
