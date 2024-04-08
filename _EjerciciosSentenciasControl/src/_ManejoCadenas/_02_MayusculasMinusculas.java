package _ManejoCadenas;

import java.util.Scanner;

public class _02_MayusculasMinusculas {
	//Desarrolla un programa que solicite al usuario ingresar una cadena y luego muestre 
	//la misma cadena en mayúsculas y minúsculas.

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación MAYÚSCULAS Y MINÚSCULAS");
		System.out.println("---------------------------------------------------");
		System.out.println("---------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una frase: ");
		String cadena = sc.nextLine();
		
		System.out.println("Frase en Mayúculas: " + cadena.toUpperCase());
		System.out.println("Frase en Minusculas: " + cadena.toLowerCase());
	}

}
