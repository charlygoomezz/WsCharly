package _EjerciciosConversiones;

public class EnteroFlotante {
	//Crea un programa que utilice un número de punto flotante y luego convierta
	//ese número en un número entero. Muestra el valor resultante en la pantalla.
	//¿Hace falta hacer un casting en este caso?¿Hemos perdido información?

	public static void main(String[] args) {
		int numeroEntero = 13;
		float numeroFloat = 12.23F;
		//Lo que está en una caja pequeña siempre entra en una caja grande.
		numeroFloat = numeroEntero;
		System.out.println(numeroFloat);
		
		//En este caso no es necesario hacer 'casting', y no perdemos información
		
		
		
				

	}

}
