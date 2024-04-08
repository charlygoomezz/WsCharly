package _ManejoCadenas;

import java.util.Scanner;

public class _01_LongitudCadena {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación LONGITUD DE CADENA");
		System.out.println("----------------------------------------------");
		System.out.println("----------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese una frase: ");
		String cadena = sc.nextLine();
		
		System.out.println("El tamaño de la frase es de: " + cadena.length() + " caracteres.");
		

	}

}
