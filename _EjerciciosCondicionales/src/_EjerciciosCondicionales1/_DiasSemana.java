package _EjerciciosCondicionales1;

import java.util.Scanner;

public class _DiasSemana {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación DÍAS DE LA SEMANA");
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		pedirNumeros();
	}
	public static void pedirNumeros() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número del 1 al 7:");
		int n1 = sc.nextInt();
		
		
		semana(n1);
	}
	public static void semana(int n1) {
		if(n1 == 1) {
			System.out.println("El dia de la semana es LUNES");
		}
		else if(n1 == 2) {
			System.out.println("El dia de la semana es MARTES");
		}
		else if(n1 == 3) {
			System.out.println("El dia de la semana es MIÉRCOLES");
		}
		else if(n1 == 4) {
			System.out.println("El dia de la semana es JUEVES");
		}
		else if(n1 == 5) {
			System.out.println("El dia de la semana es VIERNES");
		}
		else if(n1 == 6) {
			System.out.println("El dia de la semana es SÁBADO");
		}
		else if(n1 == 7) {
			System.out.println("El dia de la semana es DOMINGO");
		}
		else {
			System.out.println("No existe ningún DIA DE LA SEMANA");
		}
	}
		
	
}
