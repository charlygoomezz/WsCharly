package _EjerciciosFor;

import java.util.Scanner;

public class _ejercicio5 {
	//PEDIR UN NÚMERO AL USUARIO E IMPRIMIR SU TABLA DE MULTIPLICAR

	public static void main(String[] args) {
		System.out.println("APLICACIÓN TABLA DE MULTIPLICAR");
		System.out.println("---------------------------------------------------");
		System.out.println("---------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int numero = sc.nextInt();
		
		long multiplicacion = 1;
		for(int i = 1; i <= 10 ; i++ ) {
			multiplicacion = numero * i;
			System.out.println("Imprimir : " + multiplicacion);
		}
	}

}
