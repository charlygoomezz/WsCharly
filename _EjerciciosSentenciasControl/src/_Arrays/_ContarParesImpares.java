package _Arrays;

import java.util.Scanner;

public class _ContarParesImpares {
	//Escribe un programa que solicite al usuario ingresar el tamaño de un array de números enteros. 
	//A continuación se le pedirá números hasta que el array esta lleno. El programa contará el número
	//de pares e impares que hay en el array y mostrará dicha cuenta por pantalla.

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación CONTADOR DE PARES E IMPARES");
		System.out.println("-------------------------------------------------------");
		System.out.println("-------------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el tamaño del array:");
		int tamañoArray = sc.nextInt();
		System.out.println("El programa tendrá " + tamañoArray + " posiciones empezando desde el 0.");
		
		int[] numeros = new int[tamañoArray];
		
		
		for(int i = 0; i < tamañoArray;i++) {
			System.out.println("Ingrese un número en la posicion " + i + ": " );
			numeros[i] = sc.nextInt();
		}
		int pares = 0;
		int impares = 0;

		for(int arrayParImpar: numeros) {
			if(arrayParImpar % 2 == 0) {
				pares++;
					
			}else{
				impares++;
				
			}
			
		}
		System.out.println("El numero de pares es: " + pares);
		System.out.println("El numero de impares es: " + impares);
	}

}
