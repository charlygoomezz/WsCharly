package _EjerciciosConversiones;

public class FlotanteEntero {
	//Crea un programa que utilice un número entero y luego convierta ese número
	//en punto flotante. Muestra el valor resultante en la pantalla. ¿Hace falta 
	//hacer un casting en este caso?¿Hemos perdido información?.


	public static void main(String[] args) {
		int numeroEntero = 0;
		float numeroFloat = 12.23F;
		//numeroEntero =numeroFloat;//Daria error
		numeroEntero = (int)numeroFloat;
		System.out.println(numeroEntero);
		
		//Es necesario realizar un 'cast' para convertir el entero en numero 
		//flotante, pero se pierde información, en este caso la parte decimal.
		
		//Siempre que queramos pasar lo que haya de una caja grande a una caja
		//pequeña, es obligatorio hacer un casting. NO importa que el valor que
		//tenga la caja grande entre en la pequeña.
		

	}

}
