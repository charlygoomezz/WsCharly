package _EjerciciosCondicionales1;

import java.util.Scanner;

public class _Ejercicio01 {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación MAYOR o MENOR");
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		pedirNumeros();
	}
	public static void pedirNumeros() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		int n1 = sc.nextInt();
		System.out.println("Introduzca otro número:");
		int n2 = sc.nextInt();
		System.out.println("-----------------");;
		
		mayorOMenor(n1,n2);
	}
	public static void mayorOMenor(double n1, double n2) {
		if(n1 > n2) {
			System.out.println("El primer número es mayor que el segundo");
		}
		else if(n1 < n2) {
			System.out.println("El segundo número es mayor que el primero");
		}
		else if(n1 == n2) {
			System.out.println("Los dos números son iguales");
		}
	}
		
	
}
