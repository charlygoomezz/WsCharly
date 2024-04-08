package _EjerciciosWhile;

public class _Ejercicio4 {
	//SUMAR LOS PRIMEROS 100 NÚMEROS NATURALES

	public static void main(String[] args) {
		System.out.println("APLICACIÓN SUMAR LOS 100 PRIMEROS NUMEROS NATURALES");
		System.out.println("---------------------------------------------------");
		System.out.println("---------------------------------------------------");
		
		int i = 1;
		long acumulador = 0;
		while(i <= 100) {
			acumulador += i;
			i++;
			
		}
		System.out.println("El resultado de la suma total será:" + acumulador);
	}

}
