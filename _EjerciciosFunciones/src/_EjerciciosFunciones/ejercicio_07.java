package _EjerciciosFunciones;

public class ejercicio_07 {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación MEDIA");
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		calcularMedia(1,2,3);
		calcularMedia(3.4,5.6,9);
	}
	public static void calcularMedia(double numero1, double numero2, double numero3) {
		
		double media = (numero1 + numero2 + numero3) / 3 ;
		System.out.println("La media de los tres números es: " + media);
		
	}
}
