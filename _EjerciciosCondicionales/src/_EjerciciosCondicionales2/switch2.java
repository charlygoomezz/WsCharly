package _EjerciciosCondicionales2;

import java.util.Scanner;

public class switch2 {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación PAR O IMPAR");
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		int n1 = sc.nextInt();
		System.out.println("-----------------");
		
		switch(n1 % 2) {
		case 0:
			System.out.println("El número es PAR");
			break;
		case 1:
		case -1:
			System.out.println("El número es IMPAR");
			break;
		default:
			System.out.println("El numero no es entero");
		}

	}

}
