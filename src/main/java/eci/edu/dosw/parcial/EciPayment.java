package eci.edu.dosw.parcial;

import java.util.Scanner;

public class EciPayment {
    

   

   
    private TiendaVirtual tienda;
    private MetodoDePago metodoDePago;
    
    public EciPayment() {
        this.metodoDePago = null;
        this.tienda = new TiendaVirtual();
    }
    public void realizarCompra() {
        if (metodoDePago != null) {
            System.out.println("No se ha seleccionado un metodo de pago");
            cambiarMetodoDePago();
        }else{
            Scanner sc = new Scanner(System.in);  
            System.out.println("Que producto va a comprar");
            String productoName = sc.nextLine();
            System.out.println("Cuanto cuesta el producto");
            String productoPrice = sc.nextLine();
            System.out.println("Cuantos productos va a comprar");
            String productoCantidad = sc.nextLine();
            System.out.println("Cual es su correo");
            String correo = sc.nextLine();
            sc.close();
            tienda.realizarCompra(productoName, productoPrice, productoCantidad,correo);
            // LOGICA PARA GENERAR VALIDACIONES
        }
    }

    public void generarValidaciones() {
        tienda.generarValidadores();
    }


    public void cambiarMetodoDePago() {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Que metodo de pago desea usar? (1: Efectivo, 2: TarjetaDebito, 3: TarjetaCredito)");
        System.out.println("Escoja una opcion: ");
        String userName = sc.nextLine();
        if(userName.equals("1")){
            metodoDePago = new Efectivo();
            setMetodoDePago(metodoDePago);
        }
        else if(userName.equals("2")){
            metodoDePago = new TarjetaDebito();
            setMetodoDePago(metodoDePago);
        }
        else if(userName.equals("3")){
            metodoDePago = new TarjetaCredito();
            setMetodoDePago(metodoDePago); 
        }
        else{
            System.out.println("Opcion invalida, se usara el metodo de pago anterior");
        }
        sc.close();
    }

    public TiendaVirtual getTienda() {
        return tienda;
    }

    public void setTienda(TiendaVirtual tienda) {
        this.tienda = tienda;
    }

    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(MetodoDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }
}
