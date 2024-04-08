package _EjerciciosFor;

import java.util.Scanner;

public class _ejercicio9 {
	//REALIZAR LAS TAREAS 3,5 Y 8 MEDIANTE FUNCIONES.

	public static void main(String[] args) {
		
		actividad3();
		actividad5();
		

	}
	
	public static void actividad3(){
		
		System.out.println("Introduce el primer número: ");
		Scanner sc = new Scanner(System.in);
		int numero1 = sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		int numero2 = sc.nextInt();
	
		for(int i = numero1; i <= numero2; i ++) {
			System.out.println("Imprimir: " + i);
		}
		
	}
	public static void actividad5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int numero = sc.nextInt();
		
		long multiplicacion = 1;
		for(int i = 1; i <= 10 ; i++ ) {
			multiplicacion = numero * i;
			System.out.println("Imprimir : " + multiplicacion);
		}
	
	
	}
}
