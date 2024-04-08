package _EjerciciosFunciones2;

import java.util.Scanner;

public class _Ejercicio3 {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación CALCULADORA");
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
		
		suma(n1,n2);
		resta(n1,n2);
		multiplicacion(n1,n2);
		division(n1,n2);
		
		
	}
	public static void suma(int n1, int n2) {
		int sumaEntera = (n1 + n2);
		System.out.println("El resultado de las suma es: " + sumaEntera);
		
	}
	public static void resta(int n1, int n2) {
		int resultado = (n1 - n2);
		System.out.println("El resultado de las resta es: " + resultado);
	}
	public static void multiplicacion(int n1, int n2) {
		int resultado = (n1 * n2);
		System.out.println("El resultado de la multiplicaión es: " + resultado);
	}
	public static void division(int n1, int n2) {
		int resultado = (n1 / n2);
		System.out.println("El resultado de la división es: " + resultado);
	}
}		
	
	