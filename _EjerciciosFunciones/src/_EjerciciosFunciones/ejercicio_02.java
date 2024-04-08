package _EjerciciosFunciones;


public class ejercicio_02 {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación PERÍMETRO");
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		perimetro(2, 3);
		perimetro(2, 4);
		

	}
	
	public static void perimetro(double base, double altura) {
		
		
		double resultadoPerimetro = 2 * (base + altura);
		System.out.println("El perimetro es: " + resultadoPerimetro);
		
	}
}
