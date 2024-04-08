package _EjerciciosFunciones;

public class ejercicio_5 {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación HIPOTENUSA");
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		hipotenusa(2,3);		
		hipotenusa(4.5,8.3);
		

	}
	public static double hipotenusa(double catetoA, double catetoB) {
		
		double resultado = (Math.sqrt((catetoA * catetoA) + (catetoB * catetoB)));
		System.out.println("La hipotenusa del triángulo es: " + resultado);
		return resultado;
	
	
	}
}
