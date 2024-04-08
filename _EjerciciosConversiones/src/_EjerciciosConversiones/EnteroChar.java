package _EjerciciosConversiones;
	//Escribe un programa que utilice un entero y luego convierte ese entero 
	//en su valor de carácter y muestra el valor resultante en la pantalla. 
	//¿Podemos realizar la operación? ¿Hace falta hacer un casting?

public class EnteroChar {

	public static void main(String[] args) {
		char caracter;
		int numeroEntero = 65;
		//caracter = numeroEntero; Nos da ERROR
		caracter = (char)numeroEntero; 
		System.out.println(caracter);
		
		//Es necesario 'castear' el valor, y nos imprimiá el valor en forma de carcater.
		//Si el valor del numero entero es <= a 31 o = 127, no nos imprimira 
		//ningun valor por pantalla, ya que estos numeros corresponden a acciones en
		//la tabla ASCII
		
		

	}

}
