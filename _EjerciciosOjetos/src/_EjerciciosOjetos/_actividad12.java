package _EjerciciosOjetos;

public class _actividad12 {

	public static void main(String[] args) {
		Coche2 c1 = new Coche2();
		Coche2 c2 = new Coche2(12873723,"Lamborghini","Murciélago",320000, "12/7/2022",6003.23);
		
		
		//INVOCAR MÉTODOS
		
		//Metodo mostrar datos por pantalla
		System.out.println("-----------------------");
		System.out.println("Datos coche 1: ");
		c1.mostrarDatos();
		System.out.println("Datos coche 2: ");
		c2.mostrarDatos();
		System.out.println("-----------------------");

		//Metodo mostras el precio base
		System.out.println("-----------------------");
		System.out.println("Precio base coche 1: ");
		c1.precioBase();
		System.out.println("Precio base coche 2: ");
		c2.precioBase();
		System.out.println("-----------------------");

		//Metodo año de matriculación
		System.out.println("-----------------------");
		System.out.println("Año de matriculación del coche 2: ");
		c2.soloAño();
		System.out.println("-----------------------");
		
		//Metodo año bisiesto
			
		//Metodo precio en funcion de los kilometros
		System.out.println("-----------------------");
		System.out.println("Precio del coche 1 según sus kilómetros: ");
		c1.precioKilometros();
		System.out.println("Precio del coche 2 según sus kilómetros: ");
		c2.precioKilometros();
		System.out.println("-----------------------");
			
		//Metodo para saber si los kilotros son primos
		System.out.println("-----------------------");
		System.out.println("¿El número de kilómetros del coche 1 es primo?: ");
		c1.esPrimo(0);
		System.out.println("¿El número de kilómetros del coche 2 es primo?: ");
		c2.esPrimo(320000);
		System.out.println("-----------------------");
			
		//Metodo cuantos kilometros faltan
		System.out.println("-----------------------");
		System.out.println("¿Cuantos kilómetros le faltan al coche 2 para llegar a 200000?: ");
		c2.cuantosKilometrosFaltan();
		System.out.println("-----------------------");
		
		//Metodo para saber los caracteres de la marca 
		int longitudMarca = c2.numeroCaractersMarca();
		System.out.println("-----------------------");
		System.out.println("¿Cuantos caracteres tiene la marca del coche 2?: " + longitudMarca);
		System.out.println("-----------------------");
		
		// Método para obtener los caracteres del modelo
		int longitudModelo =c2.numeroCaracteresModelo();
		System.out.println("-----------------------");
		System.out.println("¿Cuantos caracteres tiene el modelo de coche 2?: " + longitudModelo);
		System.out.println("-----------------------");
		   
		//Metodo comparar kilometros
		
		    
		//Metodo para saber si un COCHE es mas caro que otro
        System.out.println("¿El coche 1 tiene mas kilómetros que el coche 2?");
        System.out.println(c1.esMasCaroQue(c2) ? "Sí" : "No");
		  	
	}
	


	




	}


