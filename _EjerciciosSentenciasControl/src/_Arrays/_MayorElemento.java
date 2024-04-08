package _Arrays;

import java.util.Scanner;

public class _MayorElemento {
	//Escribe un programa que solicite al usuario ingresar el tamaño de un array de números enteros. 
	//A continuación se le pedirá números hasta que el array esta lleno y por último recorrerá el 
	//array para buscar el mayor número y lo imprimirá.

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación MAYOR ELEMENTO");
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
		int mayorNumero = numeros[0];
        for (int i = 1; i < tamañoArray; i++) {
            if (numeros[i] > mayorNumero) {
                mayorNumero = numeros[i];
            }
        }

        
        System.out.println("El mayor número en el array es: " + mayorNumero);


	}

}
