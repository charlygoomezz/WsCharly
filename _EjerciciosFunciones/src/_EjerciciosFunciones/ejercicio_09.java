package _EjerciciosFunciones;

public class ejercicio_09 {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación SUELDO");
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		sueldoFinal(1200,4,10);
		sueldoFinal(1400,3,10);
		

	}
	public static void sueldoFinal(double sueldo, double horas, double precio) {
		
		double sueldoFinal = sueldo + (horas * precio);
		System.out.println("El sueldo este mes es de: " + sueldoFinal + "€");
		
	}
}	
			
