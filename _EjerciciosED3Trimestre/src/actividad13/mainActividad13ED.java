package actividad13;

import java.util.Scanner;

import lib.Matematicas;


public class mainActividad13ED {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación CALCULADORA");
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
	calculadora();
		

	}
	public static void menu() {
		System.out.println("----------------------------");
		System.out.println("PARA SUMAR PULSE 1");
		System.out.println("PARA RESTAR PULSE 2");
		System.out.println("PARA MULTIPLICAR PULSE 3");
		System.out.println("PARA DIVIDIR PULSE 4");
		System.out.println("PARA SALIR DEL PROGRAMA PULSE 5");
		System.out.println("----------------------------");
		
		
	}
	public static void calculadora() {
		Scanner sc = new Scanner(System.in);
		
		int operador = 0;
	
		do {
			operador = 0;
			menu();
			operador = sc.nextInt();
			if(operador == 5) {
				System.out.println("SALISTE DEL PROGRAMA");
				break;
			}
			else {
			    System.out.println("Introduzca un número:");
				double n1 = sc.nextDouble();
				System.out.println("Introduzca otro número:");
				double n2 = sc.nextDouble();
				System.out.println("-----------------");
			
		switch (operador) {
		case 1:
			System.out.println("La suma es: " + Matematicas.sumar(n1,n2)); 
			break;
		case 2:
			System.out.println("La resta es: " + Matematicas.restar(n1,n2));
			break;
		case 3:
			System.out.println("La multiplicacion es: " + Matematicas.multiplicar(n1,n2));
			break;
		case 4:
			System.out.println("La division es: " + Matematicas.sumar(n1,n2));
			break;
		default:
			System.out.println("El operador no existe");
			
		}
			}}while(operador!=5);
		
		
			
	}

}
