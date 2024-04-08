package _Ejercrcios2;

import java.util.Scanner;

public class _PerimetroArea {

	public static void main(String[] args) {
		System.out.println("Bienvenido a la calculadora de Perimetro y Área de un rectángulo!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------");
		
		//PERÍMETRO
		System.out.println("Introduzca la longitud deL rectángulo (con comas si es necesario):");
		double l1 = sc.nextDouble();
		System.out.println("Introduzca la base deL rectángulo (con comas si es necesario34,):");
		double b1 = sc.nextDouble();
		double perimetro = 2 * (l1 + b1);
		System.out.println("EL PERÍMETRO ES: " + perimetro);
		System.out.println("-----------------");
		
		//ÁREA
		double area = l1 * b1;
		System.out.println("EL ÁREA ES: " + area);
		
		
		
		
		

	}

}
