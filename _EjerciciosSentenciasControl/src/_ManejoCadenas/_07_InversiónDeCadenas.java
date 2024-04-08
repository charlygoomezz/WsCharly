package _ManejoCadenas;

import java.util.Scanner;

public class _07_InversiónDeCadenas {
	//Escribe un programa que tome una cadena como entrada y muestre la misma 
	//cadena pero invertida. Por ejemplo, si el usuario ingresa "Java", el 
	//programa debería mostrar "avaJ".

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación INVERSION DE CADENAS");
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
		System.out.println(cadena2);
		
	

	}

}
