package _EjerciciosFunciones;

public class ejercicio_08 {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación NOTA FINAL");
		System.out.println("Las calificaciones han de introducirse con comas si es necesario");
		System.out.println("Intoduce primero tus notas parciales, luego la nota del examen final y finalmente la nota del trabajo.");
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		
		notaFinal(3,5,7,9.5,4);
		notaFinal(1.2,4.3,7,9.5,8);
		
	}
	
	public static double notaFinal(double nota1, double nota2, double nota3, double notaF, double notaT) {
			
		double notaFinal = (((nota1 + nota2 + nota3) / 3) * 0.55) + (notaF * 0.3) +(notaT * 0.15);
		System.out.println("La media del curso es: " + notaFinal);
		System.out.println("------------------");
		return notaFinal;
	}
			
	
}
