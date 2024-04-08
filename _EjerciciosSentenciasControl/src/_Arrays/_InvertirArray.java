package _Arrays;

import java.util.Scanner;

public class _InvertirArray {
	//Escribe un programa que solicite al usuario ingresar el tamaño de un array de números enteros. 
	//A continuación se le pedirá números hasta que el array esta lleno. El siguiente paso será 
	//invertir el orden de los valores  e imprimirlos por pantalla.

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación INVERTIR ARRAY");
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el tamaño del array:");
		int tamañoArray = sc.nextInt();
		System.out.println("El programa tendrá " + tamañoArray + " posiciones empezando desde el 0.");
		
		int[] numeros = new int[tamañoArray];
		
		
		for(int i = 0; i < tamañoArray;i++) {
			System.out.println("Ingrese un número en la posicion " + i + ": " );
			numeros[i] = sc.nextInt();
		}
		System.out.println("El orden inverso es: ");
		
		for(int i = tamañoArray -1; i >= 0; i--) {
			System.out.print("-" + numeros[i] + "-");
		}
		
		}
	}


