package _EjerciciosFor;

import java.util.Scanner;

public class _ejercicio3 {
	//PEDIR 2 NÚMERO POR PANTALLA Y QUE MUESTRE LOS NÚMEROS DESDE EL 
	//PRIMER NUMERO HASTA EL SEGUNDO

	public static void main(String[] args) {
		System.out.println("APLICACIÓN DE 1 NUMERO A OTRO NUMERO POR PANTALLA");
		System.out.println("-------------------------------------------------");
		System.out.println("-------------------------------------------------");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		int numero1 = sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		int numero2 = sc.nextInt();
		
		if(numero2 < numero1) {
			for(int i = numero1; i >= numero2; i --) {
				
				System.out.println("Imprimir: " + i);
				}
		}
		
		for(int i = numero1; i <= numero2; i ++) {
			
			System.out.println("Imprimir: " + i);
		}
		
	}

}
