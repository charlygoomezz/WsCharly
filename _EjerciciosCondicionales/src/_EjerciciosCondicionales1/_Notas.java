package _EjerciciosCondicionales1;

import java.util.Scanner;

public class _Notas {

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
		if(n1 >= 50 && n1 <= 100) {
			System.out.println("APROBADO");
		}
		else if(n1 < 50 && n1 >= 0) {
			System.out.println("SUSPENSO");
		}
		else {
			System.out.println("No existe la calificación");
		}
		
	}
		
	
}
