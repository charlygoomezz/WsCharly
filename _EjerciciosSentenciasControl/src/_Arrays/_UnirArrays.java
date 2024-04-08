package _Arrays;

import java.util.Scanner;

public class _UnirArrays {
	//Escribe un programa que solicite al usuario ingresar el tamaño de dos arrays de números enteros. 
	//A continuación se le pedirá números hasta que los arrays estén llenos. A continuación, el programa 
	//unirá los dos arrays en otro array más grande, y por último imprimirá la suma de todos los elementos 
	//de ese array nuevo.

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación UNIR ARRAYS");
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el tamaño del primer array:");
		int tamañoArray1 = sc.nextInt();
		System.out.println("El programa tendrá " + tamañoArray1 + " posiciones empezando desde el 0.");
		System.out.println("------------------------------------------------------------------------");
		
		int[] numeros1 = new int[tamañoArray1];
		
		
		for(int i = 0; i < tamañoArray1;i++) {
			System.out.println("Ingrese un número en la posicion " + i + ": " );
			numeros1[i] = sc.nextInt();
		}
		
		System.out.println("Introduzca el tamaño del segundo array:");
		int tamañoArray2 = sc.nextInt();
		System.out.println("El programa tendrá " + tamañoArray2 + " posiciones empezando desde el 0.");
		System.out.println("------------------------------------------------------------------------");
		
		int[] numeros2 = new int[tamañoArray2];
		
		
		for(int i = 0; i < tamañoArray2;i++) {
			System.out.println("Ingrese un número en la posicion " + i + ": " );
			numeros2[i] = sc.nextInt();
		}
		int tamañoArrayNuevo = tamañoArray1 + tamañoArray2;
		int[] arrayNuevo = new int[tamañoArrayNuevo];
		
		for(int i = 0; i < tamañoArray1; i++) {
			arrayNuevo[i] = numeros1[i];
		}
		
		for(int i = 0; i < tamañoArray2; i++) {
			arrayNuevo[tamañoArray1 + i] = numeros2[i];
		}
		int sumaTotal = 0;
        for (int numeroTotal : arrayNuevo) {
            sumaTotal += numeroTotal;
        }

        
        System.out.println("La suma total de los elementos del array combinado es: " + sumaTotal);
	}

}
