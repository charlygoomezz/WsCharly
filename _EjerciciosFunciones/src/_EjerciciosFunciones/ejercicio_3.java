package _EjerciciosFunciones;


public class ejercicio_3 {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación PERÍMETRO");
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		perimetro (2,3);
		perimetro (4.5,8.3);
		
		

	}
	
	public static double perimetro( double base , double altura) {
		
		double perimetro = ((2 * base) + (2 * altura));
		System.out.println("El perimetro del rectangulo es: " + perimetro);
		return perimetro;
		
	}
}
