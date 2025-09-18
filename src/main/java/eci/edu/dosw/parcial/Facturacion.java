package eci.edu.dosw.parcial;

public class Facturacion extends Modulo {
    public void generarFactura(String nombreProducto, String canntidadProducto, String precioProducto) {
        //LOGICA PARA GENERAR FACTURA
    }
    @Override
    public void generarValidador(String nombreProducto, String canntidadProducto, String precioProducto, String correo) {
        generarFactura(nombreProducto,canntidadProducto, precioProducto);
    }

    
}
