package eci.edu.dosw.parcial;

public class Notificacion extends Modulo  {

    public void generarValidador(String nombreProducto, String canntidadProducto, String precioProducto, String correo) {
        enviarCorreo(correo);   
    }

    public void enviarCorreo(String correo) {
        // Lógica para enviar correo
        
    }
}
