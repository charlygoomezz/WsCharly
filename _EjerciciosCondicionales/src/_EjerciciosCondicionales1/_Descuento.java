package _EjerciciosCondicionales1;

import java.util.Scanner;

public class _Descuento {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación DESCUENTO");
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		descuento();
	}
	public static void descuento() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el importe de la compra: ");
		double importe = sc.nextDouble();
		System.out.println("Introduzca el descuento aplicado: ");
		int descuento = sc.nextInt();
		System.out.println("------------------------------------");
		
		
		if(importe >= 100) {
			System.out.println("El descuento es de: " + descuento + "%");
			System.out.println("El importe a pagar es de: " + (importe * 0.9) + "€");
		}
		else if(importe >= 50) {
			System.out.println("El descuento es de: " + descuento + "%");
			System.out.println("El importe a pagar es de: " + (importe * 0.95) + "€");
		}
		else {
			System.out.println("El descuento es de: " + descuento + "%");
			System.out.println("El importe a pagar es de: " + importe + "€");
		}
		
		
		
	}
}
