package _EjerciciosFor;

import java.util.Scanner;

public class _ejercicio11 {
	//CALCULAR LA POTENCIA DE UN NÚMERO INTRODUCIDO POR PANTALLA

	public static void main(String[] args) {
		System.out.println("APLICACIÓN POTENCIA DE UN NÚMERO");
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la base: ");
		int base = sc.nextInt();
		System.out.println("Introduce el exponente: ");
		int exponente = sc.nextInt();
		
		long resultado = 1;
		
		for(int i = 0; i < exponente; i ++) {
			
			resultado *= base;
			System.out.println(resultado);
			
		}
		System.out.println("El resultado es: " + resultado);

	}

}
