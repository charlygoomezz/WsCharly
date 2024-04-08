package _EjerciciosConversiones;
	//Escribe un programa que utilice un carácter y luego convierte ese carácter
	//en su valor entero y muestra el valor resultante en la pantalla. ¿Podemos 
	//realizar la operación? ¿Hace falta hacer un casting?

public class CharEntero {

	public static void main(String[] args) {
		char caracter = 'a';
		int numeroEntero = 12;
		numeroEntero = caracter;
		System.out.println(numeroEntero);
		
		//La operacion es realizable sin hacer 'casting, y el resultado en pantalla
		//es el caracter equivalente en la tabla de código ASCII.

	}

}
