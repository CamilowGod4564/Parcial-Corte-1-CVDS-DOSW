package eci.edu.dosw.parcial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	   public static void main(String[] args) {
		   java.util.Scanner scanner = new java.util.Scanner(System.in);
		   EciPayment eciPayment = new EciPayment();
		   System.out.println("\nBienvenido a EciPayment");
		   java.util.Map<String, Runnable> acciones = new java.util.LinkedHashMap<>();
		   acciones.put("1", () -> { eciPayment.realizarCompra(); System.out.println("Compra realizada."); });
		   acciones.put("2", () -> { eciPayment.generarValidaciones(); System.out.println("Validaciones generadas."); });
		   acciones.put("3", () -> { eciPayment.cambiarMetodoDePago(); System.out.println("Método de pago cambiado a TarjetaDébito."); });
		   acciones.put("4", () -> { System.out.println("Saliendo de EciPayment. ¡Hasta luego!"); });

		   boolean salir = false;
		   while (!salir) {
			   System.out.println("\nSeleccione la opción que desea realizar:");
			   java.util.List<String> opciones = java.util.Arrays.asList(
				   "1. Realizar compra",
				   "2. Generar validaciones",
				   "3. Cambiar método de pago ",
				   "4. Salir"
			   );
			   opciones.forEach(System.out::println);
			   System.out.print("Opción: ");
			   String opcion = scanner.nextLine();
			   Runnable accion = acciones.get(opcion);
			   if (accion != null) {
				   accion.run();
				   if ("4".equals(opcion)) salir = true;
			   } else {
				   System.out.println("Opción no válida. Intente de nuevo.");
			   }
		   }
		   scanner.close();
		   // Si quieres seguir usando Spring Boot, descomenta la siguiente línea:
		   // SpringApplication.run(Application.class, args);
	   }

}
