package _EjerciciosSentenciasControl;

import java.util.Scanner;

public class _VerificadorPrimos {

	public static void main(String[] args) {
		System.out.println("Bienvenido a la aplicación VERIFICADOR DE NÚMEROS PRIMOS");
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		

		Scanner sc = new Scanner(System.in);
		int numero = pedirNumero(sc);
		boolean primo = esPrimo(numero);
		if(primo) {
			System.out.println("El numero es primo");
		}else {
			System.out.println("El numero no es primo");
		}
		

	}

	private static boolean esPrimo(int numero) {
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static int pedirNumero(Scanner sc) {
		System.out.println("Introduce un número");
		int numero = sc.nextInt();
		return numero;
	}

}
