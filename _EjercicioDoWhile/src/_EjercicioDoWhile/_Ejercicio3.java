package _EjercicioDoWhile;

import java.util.Scanner;

public class _Ejercicio3 {
	//CALCULAR EL FACTORIAL DE UN NÚMERO PEDIDO POR PANTALLA

	public static void main(String[] args) {
		System.out.println("APLICACIÓN IMPRIMIR FACTORIAL");
		System.out.println("------------------------------------------------");
		System.out.println("------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero entero: ");
		int numero = sc.nextInt();
		
		long factorial = 1;
		int i = 1;
		do {
			factorial *= i;
			i++;
		}while(i <= numero);
		System.out.println("El factorial de " + numero + " es: " + factorial);

	}

}

