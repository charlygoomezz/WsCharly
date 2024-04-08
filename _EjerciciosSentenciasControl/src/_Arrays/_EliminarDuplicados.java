package _Arrays;

import java.util.Scanner;

public class _EliminarDuplicados {
	//Escribe un programa que solicite al usuario ingresar el tamaño de un array de números enteros. 
	//A continuación se le pedirá números hasta que el array esta lleno. El programa recorrerá el 
	//array para eliminar los números duplicados y por último imprimirá el nuevo array

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación ELIMINAR DUPLICADOS");
		System.out.println("-----------------------------------------------");
		System.out.println("-----------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el tamaño del array:");
		int tamañoArray = sc.nextInt();
		System.out.println("El programa tendrá " + tamañoArray + " posiciones empezando desde el 0.");
		
		int[] numeros = new int[tamañoArray];
		
		
		for(int i = 0; i < tamañoArray;i++) {
			System.out.println("Ingrese un número en la posicion " + i + ": " );
			numeros[i] = sc.nextInt();
		}
		int tamañoArray2 = tamañoArray;
		int[] numeros2 = new int[tamañoArray2];
		for(int j = 0; j < tamañoArray2; j++) {
			System.out.println("Ingrese un número en la posicion " + j + ": " );
			numeros2[j] = sc.nextInt();
					
		}
		
			
		}
	}


