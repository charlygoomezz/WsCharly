package _Ejercrcios2;

import java.util.Scanner;

public class _Sueldo2 {

	public static void main(String[] args) {
		System.out.println("Bienvenido a la calculadora de Sueldo!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------");

		// SUELDO BASE
		System.out.println("Introduzca su sueldo base en €: ");
		double sb = sc.nextDouble();

		// HORAS EXTRA
		System.out.println("Introduzca el numero de horas extra en este mes: ");
		int horasExtra = sc.nextInt();
		System.out.println("-----------------");
		int dineroExtra = horasExtra * 40;
		System.out.println("LAS HORAS EXTRA SON: " + dineroExtra + "€");

		// SUELDO TOTAL
		System.out.println("-----------------");
		double sueldoTotal = sb + dineroExtra;
		System.out.println("EL SUELDO DE ESTE MES ES: " + sueldoTotal + "€");

	}

}
