package _Ejercrcios2;

import java.util.Scanner;

public class _Media {

	public static void main(String[] args) {
		System.out.println("Bienvenido a la calculadora de la media de 3 números");
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------");
		
		//MEDIA
		System.out.println("Introduzca un número:");
		double n1 = sc.nextDouble();
		System.out.println("Introduzca otro número:");
		double n2 = sc.nextDouble();
		System.out.println("Introduzca otro número:");
		double n3 = sc.nextDouble();
		System.out.println("-----------------");
		double media = (n1 + n2 + n3) / 3;
		System.out.println("LA MEDIA ES: " + media);
		

	}

}
