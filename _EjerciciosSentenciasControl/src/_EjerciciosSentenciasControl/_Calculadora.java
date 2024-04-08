package _EjerciciosSentenciasControl;

import java.util.Scanner;

public class _Calculadora {

	public static void main(String[] args) {
			System.out.println("Bienvenidos a la aplicación CALCULADORA");
			System.out.println("---------------------------------------------");
			System.out.println("---------------------------------------------");
			Scanner sc = new Scanner(System.in);
			int menu;
			double n1;
			double n2;
			double resultado;
			
			do {
				System.out.println("-----------------------------");
				System.out.println("PARA SUMAR PULSE 1");
				System.out.println("PARA RESTAR PULSE 2");
				System.out.println("PARA MULTIPLICAR PULSE 3");
				System.out.println("PARA DIVIDIR PULSE 4");
				System.out.println("PARA CERRAR EL PROGRAMA PULSE 5");
				System.out.println("----------------------------");
				menu = sc.nextInt();
				switch(menu){
				
				case 1:
					System.out.print("Ingrese el primer número: ");
	                n1 = sc.nextDouble();
	                System.out.print("Ingrese el segundo número: ");
	                n2 = sc.nextDouble();
	                resultado = n1 + n2;
	                System.out.println("Resultado: " + resultado);	        
	                break;
				case 2:
					System.out.print("Ingrese el primer número: ");
                    n1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    n2 = sc.nextDouble();
                    resultado = n1 - n2;
                    System.out.println("Resultado: " + resultado);
                    break;
				case 3:
					System.out.print("Ingrese el primer número: ");
                    n1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    n2 = sc.nextDouble();
                    resultado = n1 * n2;
                    System.out.println("Resultado: " + resultado);
                    break;
				case 4:
					System.out.print("Ingrese el primer número: ");
                    n1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    n2 = sc.nextDouble();
                    resultado = n1 / n2;
                    System.out.println("Resultado: " + resultado);
                    break;
				case 5:
					System.out.println("CALCULADORA CERRADA");
					break;
				default:
					System.out.println("El número introducido no correspode a ninguna operación");
					break;
				}
			
			
			}while(menu != 5);
			
	}
}