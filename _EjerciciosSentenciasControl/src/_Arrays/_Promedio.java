package _Arrays;

import java.util.Scanner;

public class _Promedio {
	// Escribe un programa que solicite al usuario ingresar el tamaño de un array de números reales. 
	//A continuación se le pedirá números hasta que el array esta lleno y por último imprimirá la 
	//media aritmética de todos ellos.

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación PROMEDIO");
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el tamaño del array");
		int tamañoArray = sc.nextInt();
		System.out.println("El programa tendrá " + tamañoArray + " posiciones empezando desde el 0.");
		
		double numeros[] = new double[tamañoArray];
		for(int i = 0; i < tamañoArray; i++) {
			System.out.println("Introduzca el numero positivo de la  " + i + " posicion.");
			numeros[i] = sc.nextDouble();
		}
		double promedioSuma = 0;
		for (double array : numeros) {
            promedioSuma += array;
        }
		double promedio = promedioSuma / tamañoArray;

        System.out.println("El promedio los elementos del array es: " + promedio);
        }
	}