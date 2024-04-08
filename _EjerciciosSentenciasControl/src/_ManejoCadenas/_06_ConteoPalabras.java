package _ManejoCadenas;

import java.util.Scanner;

public class _06_ConteoPalabras {
	//Desarrolla un programa que cuente el número de palabras en una cadena ingresada 
	//por el usuario. Considera que las palabras están separadas por espacios.

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación INVERSION DE CADENAS");
		System.out.println("------------------------------------------------");
		System.out.println("------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine();
		
		int cantidadPalabras = 0;
		boolean espacio = false;
		
		for(int i = 0; i < frase.length(); i++) {
			char caracter = frase.charAt(i);
			
			if (caracter == ' ' || caracter == '\t' || caracter == '\n' || caracter == '\r') {
                espacio = false;
            } else if (!espacio) {
                cantidadPalabras++;
                espacio = true;
				
            }

		}
		System.out.println("El número de palabras que contiene la frase es: " + cantidadPalabras);
	}
}