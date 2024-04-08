package _EjerciciosConversiones;
	//Crea un programa que utilice un número entero y luego convierta ese
	//número en un número double. Muestra el valor resultante en la pantalla. 
	//¿Hace falta hacer un casting en este caso?¿Hemos perdido información?

public class EnteroDouble {

	public static void main(String[] args) {
		double numeroDoble = 234.65;
		int numeroEntero = 34;
		numeroDoble = numeroEntero;
		System.out.println(numeroDoble);
		
		//No es necesario hacer 'casting'.
			
		

	}

}
