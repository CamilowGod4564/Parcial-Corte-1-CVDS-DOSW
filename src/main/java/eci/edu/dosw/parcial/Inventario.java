package eci.edu.dosw.parcial;

public class Inventario extends Modulo {
    public void descontarProducto(String nombreProducto, String canntidadProducto, String precioProducto) {
        //LOGICA PARA DESCONTAR PRODUCTOS DEL INVENTARIO
    }

    @Override
    public void generarValidador(String nombreProducto, String canntidadProducto, String precioProducto, String correo) {
        descontarProducto(nombreProducto, canntidadProducto, precioProducto);
    }

}
