package _EjerciciosSentenciasControl;

import java.util.Random;
import java.util.Scanner;

public class _AdivinaElNumero {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación ADIVINA EL NUMERO");
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		int numeroAleatorio = r.nextInt(10)+1;
		int intentos = 0;
		int numero;
		System.out.println(numeroAleatorio);
		
		do {
			System.out.println("Introduce un número");
			numero = sc.nextInt();
			intentos++;
			if(numero > numeroAleatorio) {
				System.out.println("Te pasaste!");
			
			}else if(numero < numeroAleatorio) {
				System.out.println("Te quedaste corto!");
				
			}else {
				System.out.println("Acertaste!");
			}
		}while(numero != numeroAleatorio);
			
		

		
			

	}

}



