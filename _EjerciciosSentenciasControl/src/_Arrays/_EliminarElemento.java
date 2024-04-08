package _Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _EliminarElemento {
	// Escribe un programa que permita al usuario ingresar un valor y elimine todas las 
	//ocurrencias de ese valor en un array creado al inicio del programa. Muestra el array resultante.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el número a borrar");
		int numero = pedirNumero(sc);
		int[] arrayNumeros = {1,2,3,4,5};
		//Arrays.toStrting -> convierte un array a cadena
		for(int i = 0; i < arrayNumeros.length; i++) {
			if(numero == arrayNumeros[i]) {
				arrayNumeros[i] = 0;
			}
		}
		System.out.println("array nuevo: " + Arrays.toString(arrayNumeros));
    }

	private static int pedirNumero(Scanner sc) {
		// TODO Auto-generated method stub
		return 0;
	}
}