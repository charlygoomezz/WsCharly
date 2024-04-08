package _Arrays;

import java.util.Scanner;

public class _SumaElementos {
	//Escribe un programa que solicite al usuario ingresar el tamaño de un array de números enteros. 
	//A continuación se le pedirá números hasta que el array esta lleno y por último imprimirá la 
	//suma de todos los elementos.

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación SUMA DE ELEMENTOS");
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el tamaño del array:");
		int tamañoArray = sc.nextInt();
		System.out.println("El programa tendrá " + tamañoArray + " posiciones empezando desde el 0.");
		
		int[] numeros = new int[tamañoArray];
		
		
		for(int i = 0; i < tamañoArray;i++) {
			System.out.println("Ingrese un número en la posicion " + i + ": " );
			numeros[i] = sc.nextInt();
			
		}
		int suma = 0;
		for (int array : numeros) {
            suma += array;
        }

        System.out.println("La suma de los elementos del array es: " + suma);

        
       
    }
}
