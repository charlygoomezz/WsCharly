package _ManejoCadenas;

import java.util.Scanner;

public class _08_Palindromo {
	//Desarrolla un programa que determine si una palabra ingresada por el usuario 
	//es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda), 
	//ignorando mayúsculas y minúsculas.

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación PALINDROMO");
		System.out.println("------------------------------------------------");
		System.out.println("------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		String cadena = "";
		String cadena2 = "";
		System.out.println("Escribe una frase: ");
		cadena = sc.nextLine();
		
		for(int i = cadena.length()-1; i >= 0; i --) {
			cadena2 = cadena2 + cadena.charAt(i);
		}
		if(cadena.equalsIgnoreCase(cadena2)) {
			System.out.println("La frase es palindroma");
		}else {
			System.out.println("La frase NO es palindromo");
		}
		
		
	




	}

}
