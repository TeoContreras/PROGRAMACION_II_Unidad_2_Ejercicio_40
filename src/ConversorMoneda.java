public class ConversorMoneda {
    private ProveedorTasaCambio proveedor;
    public ConversorMoneda(ProveedorTasaCambio proveedor) { this.proveedor = proveedor; }
    public void convertir(double monto, String origen, String destino) {
        double tasa = proveedor.obtenerTasa(origen, destino);
        if (monto > 0 && tasa > 0) System.out.println(monto + " " + origen + " = " + (monto * tasa) + " " + destino);
        else System.out.println("No se pudo realizar la conversión.");
    }
}
