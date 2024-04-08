package _Ejercrcios2;

import java.util.Scanner;

public class _OperacionesSimples {

	public static void main(String[] args) {
		System.out.println("BIENVENIDO A LA CALCULADORA SIMPLE");
		System.out.println("(introduce comas en las operaciones si es necesario)");
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------");
		
		System.out.println("Introduzca un número:");
		double n1 = sc.nextDouble();
		System.out.println("Introduzca otro número:");
		double n2 = sc.nextDouble();
		System.out.println("-----------------");
		
		//SUMA
		double s1 = n1 + n2;
		System.out.println("EL RESULTADO DE LA SUMA ES: " + s1);
		System.out.println("-----------------");
		
		//RESTA
		double r1 = n1 - n2;
		System.out.println("EL RESULTADO DE LA RESTA ES: " + r1);
		System.out.println("-----------------");
		
		//MULTIPLICACIÓN
		double m1 = n1 * n2;
		System.out.println("EL RESULTADO DE LA MULTIPLICACIÓN ES: " + m1);
		System.out.println("-----------------");
		
		//DIVISIÓN
		double d1 = n1 / n2;
		System.out.println("EL RESULTADO DE LA DIVIDION ES: " + d1);
		System.out.println("-----------------");
	}

}
