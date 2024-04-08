package _ManejoCadenas;

import java.util.Scanner;

public class _05_RemplazoDeCaracteres {
	//Crea un programa que tome una cadena y reemplace todas las ocurrencias de un 
	//carácter específico con otro carácter ingresado por el usuario.

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación REMPLAZO DE CARACTERES");
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un frase: ");
		String cadena = sc.nextLine();
		System.out.println("Ingresa un el caracter que desees remplazar: ");
		String caracter1 = sc.nextLine();
		System.out.println("Ingresa el caracter por el que deseas remplazarlo: ");
		String caracter2 = sc.nextLine();
		
		String fraseReemplazada = cadena.replace(caracter1, caracter2);
		System.out.println(fraseReemplazada);
	}

}
