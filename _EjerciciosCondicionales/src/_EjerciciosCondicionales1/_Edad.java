package _EjerciciosCondicionales1;

import java.util.Scanner;

public class _Edad {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación EDAD");
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		pedirNumeros();
	}
	public static void pedirNumeros() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int n1 = sc.nextInt();
		System.out.println("-----------------");;
		
		
		edad(n1);
	}
	public static void edad(int n1) {
		if(n1 < 0) {
			System.out.println("NONATO");
		}
		else if(n1 <= 12) {
			System.out.println("NIÑO");
		}
		else if(n1 <= 19) {
			System.out.println("ADOLESCENTE");
		}

		else if(n1 <= 64) {
			System.out.println("ADULTO");
		}
		else if(n1 > 64 && n1 <= 130) {
			System.out.println("ADULTO MAYOR");
		}
		else {
			System.out.println("MORTIMER");
		}
		
		
	}
		
	
}
