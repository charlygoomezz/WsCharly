package _EjerciciosCondicionales2;
import java.util.Scanner;

public class switch1 {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación CALCULADORA");
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		menu();
		

	}
	public static void menu() {
		System.out.println("PARA SUMAR PULSE 1");
		System.out.println("PARA RESTAR PULSE 2");
		System.out.println("PARA MULTIPLICAR PULSE 3");
		System.out.println("PARA DIVIDIR PULSE 4");
		System.out.println("PARA SABER EL RESTO PULSE 5");
		System.out.println("----------------------------");
		
		calculadora();
	}
	public static void calculadora() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero de la operación:");
		System.out.println("-----------------");
		int operador = sc.nextInt();
		System.out.println("Introduzca un número:");
		double n1 = sc.nextDouble();
		System.out.println("Introduzca otro número:");
		double n2 = sc.nextDouble();
		System.out.println("-----------------");
		
		switch (operador) {
		case 1:
			suma(n1,n2);
			break;
		case 2:
			resta(n1,n2);
			break;
		case 3:
			multiplicacion(n1,n2);
			break;
		case 4:
			division(n1,n2);
			break;
		case 5:
			resto(n1,n2);
			break;
		default:
			System.out.println("El operador no existe");
			
		}
		
		
			
	}
	public static void suma(double n1, double n2) {
		double resultado = (n1 + n2);
		System.out.println("El resultado de las suma es: " + resultado);
		
	}
	public static void resta(double n1, double n2) {
		double resultado = (n1 - n2);
		System.out.println("El resultado de las resta es: " + resultado);
	}
	public static void multiplicacion(double n1, double n2) {
		double resultado = (n1 * n2);
		System.out.println("El resultado de la multiplicaión es: " + resultado);
	}
	public static void division(double n1, double n2) {
		double resultado = (n1 / n2);
		System.out.println("El resultado de la división es: " + resultado);
	}
	public static void resto(double n1, double n2) {
		double resultado = (n1 % n2);
		System.out.println("El resultado del resto es: " + resultado);
	}
}	

