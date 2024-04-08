package _EjerciciosFor;

import java.util.Scanner;

public class _ejercico8 {
	//CALCULAR EL FACTORIAL DE UN NÚMERO PEDIDO POR PANTALLA. 

	public static void main(String[] args) {
		System.out.println("APLICACIÓN IMPRIMIR FACTORIAL");
		System.out.println("------------------------------------------------");
		System.out.println("------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero entero: ");
		int numero = sc.nextInt();
		
		double factorial = 1;
		for(int i = 1; i <= numero;i ++) {
			
			factorial *= i;
			
		}
		System.out.println("El factorial de " + numero + " es: " + factorial);
	
	}

}
// OTRA FORMA
//int numero = sc.nextInt();

//double factorial = 1;
//for(int i = numero; i >= 1;i --) {
	
//	factorial *= i;
	
//}
//System.out.println("El factorial de " + numero + " es: " + factorial);
