package _Arrays;

import java.util.Scanner;

public class _MultiplicarElementos {
	//Escribe un programa que solicite al usuario ingresar el tamaño de un array de números enteros. 
	//A continuación se le pedirá números hasta que el array esta lleno y por último imprimirá la 
	//multiplicación de todos los elementos.

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación MULTIPLICAION DE ELEMENTOS");
		System.out.println("------------------------------------------------------");
		System.out.println("------------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el tamaño del array: ");
		int tamañoArray = sc.nextInt();
		System.out.println("El programa tendrá " + tamañoArray + " posiciones empezando desde el 0.");
		
		int[] numeros = new int[tamañoArray];
		for(int i = 0; i < tamañoArray; i++) {
			System.out.println("Introduzca un número en la " + i + " posición.");
			numeros[i] = sc.nextInt();
			
		}
		int multiplicacion = 1;
		for(int array : numeros) {
			multiplicacion *= array;
		}
		System.out.println("La multiplicación total es de: " + multiplicacion);
	}

}
