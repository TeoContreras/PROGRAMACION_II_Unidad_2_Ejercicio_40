public class TasaMercadoLibre extends ProveedorTasaCambio {
    public double obtenerTasa(String origen, String destino) {
        if (origen.equals("USD") && destino.equals("ARS")) return 1250;
        if (origen.equals("ARS") && destino.equals("USD")) return 1.0 / 1250;
        return 0;
    }
}
