package _EjerciciosWhile;

import java.util.Scanner;

public class _Ejercicio3 {
	//PEDIR 2 NÚMEROS POR PANTALLA Y QUE MUESTRE LOS NÚMEROS DESDE 
	//EL PRIMER NÚMERO HASTA EL SEGUNDO

	public static void main(String[] args) {
		System.out.println("APLICACIÓN DE 1 NUMERO A OTRO NUMERO POR PANTALLA");
		System.out.println("-------------------------------------------------");
		System.out.println("-------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número por pantalla");
		int numero1 = sc.nextInt();
		System.out.println("Introduce otro por pantalla");
		int numero2 = sc.nextInt();
		
		while(numero1 <= numero2) {
			System.out.println(numero1++);
		}
		

	}

}

