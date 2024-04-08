package _Ejercrcios2;

import java.util.Scanner;

public class _Sueldo {

	public static void main(String[] args) {
		System.out.println("Bienvenido a la calculadora de Sueldo!!");
		Scanner sc = new Scanner(System.in);
		
		//SUELDO BASE
		System.out.println("Introduzca su sueldo base en €: ");
		double sb = sc.nextDouble();
		
		//VENTAS
		System.out.println("Introduzca la primera venta en €: ");
		double v1 = sc.nextDouble();
		System.out.println("Introduzca la segunda venta en €: ");
		double v2 = sc.nextDouble();
		System.out.println("Introduzca la tercera venta en €: ");
		double v3 = sc.nextDouble();
		
		//RESULTADOS
		System.out.println("-----------------");
		System.out.println("SUELDO BASE: " + sb + "€");
		double comision1 = v1 / 10;
		System.out.println("COMISION DE LA 1ª VENTA: " + comision1 + "€");
		double comision2 = v2 / 10;
		System.out.println("COMISION DE LA 2ª VENTA: " + comision2 + "€");
		double comision3 = v3 / 10;
		System.out.println("COMISION DE LA 3ª VENTA: " + comision3 + "€");
		System.out.println("-----------------");

		//SUELDO TOTAL
		double sueldoTotal = sb + (comision1 + comision2 + comision3);
		System.out.println("El sueldo este mes será de: " + sueldoTotal +"€");
	
	}

}
