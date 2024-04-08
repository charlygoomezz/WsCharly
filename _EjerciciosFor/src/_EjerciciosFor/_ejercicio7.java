package _EjerciciosFor;

public class _ejercicio7 {
	//CALCULAR LA SUMA DE LOS NUMEROS PARES DEL 1 AL 50
	public static void main(String[] args) {

			System.out.println("APLICACIÓN SUMAR PARES DEL 1 AL 50");
			System.out.println("---------------------------------------------------");
			System.out.println("---------------------------------------------------");
			
			int suma = 0;
			for(int i = 2; i <= 50; i += 2) {
				suma += i;
				System.out.println("Imprimir: " + suma);
			}
			System.out.println("Imprimir: " + suma);
		}

}
