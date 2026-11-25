public class TasaBancoCentral extends ProveedorTasaCambio {
    public double obtenerTasa(String origen, String destino) {
        if (origen.equals("USD") && destino.equals("ARS")) return 1200;
        if (origen.equals("ARS") && destino.equals("USD")) return 1.0 / 1200;
        return 0;
    }
}
