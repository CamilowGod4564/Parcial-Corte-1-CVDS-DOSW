package eci.edu.dosw.parcial;

import java.util.List;

public class TiendaVirtual {
    private List<Modulo> modulos;

    public TiendaVirtual() {
        modulos = List.of(new Notificacion(), new Facturacion(), new Inventario());
    }

    public void realizarCompra(String nombreProducto, String canntidadProducto, String precioProducto, String correo) {
        for (Modulo modulo : modulos) {
            modulo.generarValidador(nombreProducto,canntidadProducto,precioProducto, correo);
        }


    }
    public void generarValidadores() {}
}
