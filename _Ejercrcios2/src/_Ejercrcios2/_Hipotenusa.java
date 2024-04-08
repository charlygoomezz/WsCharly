package _Ejercrcios2;

import java.util.Scanner;

public class _Hipotenusa {

	public static void main(String[] args) {
		System.out.println("Bienvenido a la calculadora de Hipotenusa de un triángulo rectángulo!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------");
		
		//HIPOTENUSA 
		System.out.println("Introduzca el cateto a:");
		double a1 = sc.nextDouble();
		System.out.println("Introduzca el cateto b:");
		double b1 = sc.nextDouble();
		System.out.println("-----------------");
		
		
		double h1 = Math.sqrt((a1 * a1) + (b1 * b1));
		System.out.println("LA HIPOTENUSA ES: " + h1);
		
		
		
	}

}
