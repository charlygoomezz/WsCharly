package _EjerciciosSentenciasControl;

import java.util.Scanner;

public class _ContadorNumerosPares {
	//Escribe un algoritmo que cuente y muestre la cantidad de números pares en un rango 
	//dado por el usuario.

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación CONTADOR DE NÚMEROS PARES");
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el rango A-B de números deseado");
		System.out.println("Rango A: ");
		int numero1 = sc.nextInt();
		System.out.println("Rango B: ");
		int numero2 = sc.nextInt();
		
		
		if(numero2 < numero1) {
			System.out.println("El rango B no puede ser menor que el rango A");
			System.out.println("Introduzca de nuevo:");
			return;// ESTA IF ES OPCIONAL
		}
		
		int contadorPares = 0;
		for(int i = numero1; i <= numero2; i++) {
			if(i % 2 == 0) {
				contadorPares++;
			}
			System.out.println(i);
			}
			System.out.println("El número total de números pares es: " + contadorPares);
	}

}
