package _EjerciciosSentenciasControl;

import java.util.Scanner;

public class _Fibonacci {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación SECUENCIA FIBONACCI");
		System.out.println("-----------------------------------------------");
		System.out.println("-----------------------------------------------");
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduzca cuantos numeros quiere visulizar en la secuencia: ");
		System.out.println("--------------------------");
		int numero = 0;
		int numero1 = 1;
		int suma;
		int pedirNumero = sc.nextInt();
		
		for(int i = 0; i < pedirNumero; i++) {
			
			System.out.println("La secuencia es: " + numero);
			suma = numero + numero1;
			numero = numero1;
			numero1 = suma;
		}

	}

}
