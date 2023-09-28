package controlFlow;
import java.util.Scanner;


public class EstructurasCondicionales {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		String citaProgramada = null; //se inicia la variable en NULL para almacenar ese espacio en memoria y llenarlo después con una fecha .
		
		//Condicional doble
		if(citaProgramada != null){
			System.out.println("Ya hay una cita programada.");
		}else{
			
			System.out.println("Puede registrar su cita.");
		}
		
		//switch para crear un menú
		int opcion = 1;
		System.out.println("Menú de citas");
		System.out.println("1. Programar una cita");
		System.out.println("2. Verificar cita");
		System.out.println("3. Cancelar cita");
		System.out.println("4. Salir del menú");
		System.out.println("Seleccione una opción del menú y escriba un número entre el 1 y el 4");
		
		 switch (opcion) {
		 
		 case 1: System.out.println("Elija la hora de su cita...");
		 break;
		 case 2: System.out.println("Su cita está programada para...");
		 break;
		 case 3: System.out.println("Su cita ha cida cancelada...");
		 break;
		 case 4: System.out.println("Gracias por elegir el diente feliz...");
		 break;
		 default: System.out.println("Opción no válida, escriba un número entre el 1 y el 4");
		 break;
		 
		 }*/
		 
		 

		 //Verificar que un paciente sea mayor de edad
		 System.out.println("\n");
		 System.out.println("¿Cuál es la edad del paciente?");
		 int edadPx = sc.nextInt();	
		 
		 if (edadPx >= 18) {
			 System.out.println("Elija una fecha para su cita...");
			 System.out.println("\n");
		 }else {
			System.out.println("Eres menor de edad. ¿Te va a acompañar un adulto?");
			System.out.println("\n");
			System.out.println("1. Sí me acompaña un adulto");
			System.out.println("2. No me acompaña un adulto");
			System.out.println("\n");
			System.out.println("Elige una opción, 1 o 2");
			int opcAdulto = sc.nextInt();
			if (opcAdulto == 1) {
				System.out.println("Elija una fecha para su cita..");
			}else {
				 //Operdor ternario: operador if-else en una sola línea
				 //Sintaxis: condición ? valor_cumple_condición : valor_NO_cumple_condición
				System.out.println("\n");
				String validacion = (opcAdulto != 2) ? "La opción que elegiste no es válida" : "No podemos agendarte una cita.";
				System.out.println(validacion);		
			}
		 }
		 
		 sc.close();
		 		 

	}

}

