package _EjerciciosSentenciasControl;

import java.util.Scanner;

public class _SumaNumerosPositivos {
	//Crea un algoritmo que solicite al usuario ingresar números positivos. El programa 
	//debe calcular la suma de esos números hasta que se ingrese un número negativo y 
	//acabará mostrando dicha suma.

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación SUMA DE NÚMEROS POSITIVOS");
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int suma = 0;
		
		do {
			System.out.println("Introduzca un número positivo");
			numero = sc.nextInt();
			if (numero >= 0){
				suma += numero;
			
			}else {
				System.out.println("El sumatorio termina aqui");
			}
		
		}while(numero >= 0);
			System.out.println("------------------------------");
			System.out.println("La suma total es:" + suma);
		
		}

}
