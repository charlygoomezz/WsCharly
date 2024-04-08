package _EjerciciosFunciones;

public class ejercicio_06 {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación OPERACIONES");
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		sumar(1,4);
		sumar(2,4.5);
		restar(1,7);
		restar(9.3,4);
		multiplicar(9.3,5);
		multiplicar(2,7);
		dividir(5,4.9);
		dividir(8,6);
		

	}
	public static double sumar(double numero1, double numero2) {
		
		double resultado = (numero1 + numero2);
		System.out.println("El resultado de la suma es: " + resultado);
		return resultado;
	}
	public static double restar(double numero1, double numero2) {
		
		double resultado = (numero1 + numero2);
		System.out.println("El resultado de la resta es: " + resultado);
		return resultado;
	}		
	public static double multiplicar(double numero1, double numero2) {
		
		double resultado = (numero1 + numero2);
		System.out.println("El resultado de la multiplicación es: " + resultado);
		return resultado;
	}
	public static double dividir(double numero1, double numero2) {
		
		double resultado = (numero1 + numero2);
		System.out.println("El resultado de la división es: " + resultado);
		return resultado;
	}
}
