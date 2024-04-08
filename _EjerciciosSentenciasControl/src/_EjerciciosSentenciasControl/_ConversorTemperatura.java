package _EjerciciosSentenciasControl;

import java.util.Scanner;

public class _ConversorTemperatura {
	//Diseña un algoritmo que convierta temperaturas entre Celsius y Fahrenheit. 
	//El usuario debe elegir la dirección de la conversión y proporcionar la temperatura.
	
	//La fórmula de conversión para grados Celsius: ( °F − 32) × 5 / 9 =  °C
	//La fórmula de conversión para grados Fahrenheit: (0 °C × 9 / 5) + 32 = 32 °F



	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación CONVERSOR DE TEMPERATURA");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		
		
		menu();
		

	}
	public static void menu() {
		System.out.println("----------------------------");
		System.out.println("PARA CONVERTIR DE CELSIUS A FAHRENHEIT PULSE 1");
		System.out.println("PARA PARA CONVERTIR DE FAHRENHEIT A CELSIUS 2");
		System.out.println("----------------------------");
		System.out.println("Introduzca el número de la operación que desea realizar: ");
		
		Scanner sc = new Scanner(System.in);
		int selector = sc.nextInt();
		if(selector >= 3 || selector < 1) {
			System.out.println("El número no es valido. Introduzca otro número: ");
			return;
			}
		
		
		
		if(selector == 1) {
			System.out.println("Introduca los grados Celsius: ");
			double celsius = sc.nextDouble();
			convertirCelsius(celsius);
			
		}else if(selector == 2) {
			System.out.println("Introduca los grados Fahrenheit: ");
			double fahrenheit = sc.nextDouble();
			
			convertirFahrenheit(fahrenheit);
			}
				
		}
	public static void convertirCelsius(double c1) {
		double celsius = (c1 * 1.8) + 32;
		System.out.println("La temperatura es de: " + celsius + "ºF");
		
	
	}
	public static void convertirFahrenheit(double f1) {
		double fahrenheit = (f1 - 32) * 5 / 9;
		System.out.println("La temperatura es de: " + fahrenheit + "ºC");
		
	}
}
