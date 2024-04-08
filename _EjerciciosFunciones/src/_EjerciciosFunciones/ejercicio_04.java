package _EjerciciosFunciones;

public class ejercicio_04 {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación ÁREA");
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		calcularArea(2,3);
		calcularArea(4.9,7.2);

	}
	
	public static double calcularArea( double base , double altura) {
		
		double resultado = (base * altura);
		System.out.println("El area del rectangulo es: " + resultado);
		return resultado;
	}
}