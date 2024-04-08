package _EjercicioDoWhile;

import java.util.Scanner;

public class _Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("APLICACIÓN TABLA DE MULTIPLICAR");
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int numero = sc.nextInt();
		int i = 1;
		System.out.println("La tabla de multiplicar del " + numero + " es: ");
		do {
			int resultado = numero * i;
			
			System.out.println(resultado);
			i++;
		}while(i <= 10);
			
		
		
		

	}

}
