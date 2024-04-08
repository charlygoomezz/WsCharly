package _EjerciciosCondicionales2;

import java.util.Scanner;

public class ternario2 {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación NOTAS");
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		pedirNumeros();
	}
	public static void pedirNumeros() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número del 1 al 100:");
		int n1 = sc.nextInt();
		System.out.println("-----------------");;
		
		
		notas(n1);
	}
	public static void notas(int n1) {
		String resultado = (n1 >= 50) ? "APROBADO": "SUSPENSO";
		System.out.println(resultado);
	}
		
	
}