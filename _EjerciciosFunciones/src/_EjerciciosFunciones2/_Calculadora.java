package _EjerciciosFunciones2;

public class _Calculadora {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación CALCULADORA");
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		System.out.println("----------SUMA ENTERA----------");
		suma(5,4);
		System.out.println("-------------------------------");
		System.out.println("----------SUMA DECIMAL----------");
		suma(3.4,5.7);
		System.out.println("-------------------------------.");
		System.out.println("----------RESTA ENTERA----------");
		resta(7,9);
		System.out.println("--------------------------------");
		System.out.println("----------RESTA DECIMAL----------");
		resta(3.2,7.9);
		System.out.println("--------------------------------");
		System.out.println("----------MULTIPLICACIÓN ENTERA----------");
		multiplicacion(3,4);
		System.out.println("-----------------------------------------");
		System.out.println("----------MULTIPLICACIÓN DECIMAL----------");
		multiplicacion(3.2,4.4);
		System.out.println("------------------------------------------");
		System.out.println("----------DIVISIÓN ENTERA----------");
		division(7,2);
		System.out.println("-----------------------------------");
		System.out.println("----------DIVISIÓN DECIMAL----------");
		division(9.2,4);
		System.out.println("------------------------------------");

	}
	public static int suma(int n1, int n2) {
		int sumaEntera = (n1 + n2);
		System.out.println("El resultado de las suma es: " + sumaEntera);
		return sumaEntera;
	}
	public static double suma(double numero1, double numero2) {
		
		double resultado = (numero1 + numero2);
		System.out.println("El resultado de la suma es: " + resultado);
		return resultado;
	}
	public static int resta(int n1, int n2) {
		int restaEntera = (n1 - n2);
		System.out.println("El resultado de las resta es: " + restaEntera);
		return restaEntera;
	}
	public static double resta(double numero1, double numero2) {
		
		double resultado = (numero1 + numero2);
		System.out.println("El resultado de la resta es: " + resultado);
		return resultado;
	}		
	public static int multiplicacion(int numero1, int numero2) {
		
		int multiplicacionEntera = (numero1 + numero2);
		System.out.println("El resultado de la multiplicación es: " + multiplicacionEntera);
		return multiplicacionEntera;
	}
	public static double multiplicacion(double n1, double n2) {
		double restaEntera = (n1 - n2);
		System.out.println("El resultado de lamultiplicación es: " + restaEntera);
		return restaEntera;
	}
	public static int division(int n1, int n2) {
		int divisionEntera = (n1 - n2);
		System.out.println("El resultado de la división es: " + divisionEntera);
		return divisionEntera;
	}
	public static double division(double numero1, double numero2) {
		
		double resultado = (numero1 + numero2);
		System.out.println("El resultado de la división es: " + resultado);
		return resultado; 
	}

}
