package _EjerciciosConversiones;
	//Crea un programa que utilice un número double y luego convierta ese número en un
	//número entero. Muestra el valor resultante en la pantalla. ¿Hace falta hacer un casting
	//en este caso? ¿Hemos perdido información?

public class DoubleEntero {

	public static void main(String[] args) {
		double numeroDoble = 234.65;
		int numeroEntero = 34;
		numeroEntero = (int)numeroDoble;
		System.out.println(numeroEntero);
		
		//Es necesario hacer 'casting', pero se pierde la parte decimal
				

	}

}
