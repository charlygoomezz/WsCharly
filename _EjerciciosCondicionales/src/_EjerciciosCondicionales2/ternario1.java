package _EjerciciosCondicionales2;

import java.util.Scanner;

public class ternario1 {

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
		String cadena = (n1 > n2) ? (n1 + " es mayor que " + n2) : (n1 +" es menor que " + n2);
		System.out.println(cadena);}
		
	
}


	


