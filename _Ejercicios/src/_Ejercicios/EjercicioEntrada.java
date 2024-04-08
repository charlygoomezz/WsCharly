package _Ejercicios;

import java.util.Scanner;

public class EjercicioEntrada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// TIPO STRING
		System.out.println("Introduzca una frase para leer: ");
		String frase = sc.nextLine();
		System.out.println("El usuario a introducido la frase: " + frase);

		// TIPO INT
		System.out.println("Introduzca un numero entero:");
		int entero = sc.nextInt();
		System.out.println("El número es:" + entero);

		// TIPO DOUBLE
		System.out.println("Introduzca un numero decimal:");
		double decimal = sc.nextDouble();
		System.out.println("El numero decimal es:" + decimal);
		// El numero debemos introducirlo separado por una coma, sjno nos dará ERROR!

		// TIPO LONG
		System.out.println("Introduzca un numero largo:");
		long largo = sc.nextLong();
		System.out.println("El numero es:" + largo);

		// TIPO BOOLEAN
		System.out.println("Introduzca true o false:");
		boolean b1 = sc.nextBoolean();
		System.out.println("La respuesta es:" + b1);
		// Si ponemos la respuesta en español, es decir, ponemos verdaero
		// o falso, el programa nos dará ERROR!

		// TIPO BYTE
		System.out.println("Introduzca un numero pequeño:");
		byte small = sc.nextByte();
		System.out.println("El número es:" + small);

		// TIPO CHAR
		System.out.println("Introduzca una sola letra:");
		// char letra = sc.nextChar(); esta forma de entrada no existe en Java,
		// por lo tanto nos daría error. La forma correcta de ejecutarlo sería
		char letra = sc.next().charAt(0);
		System.out.println("La letra es: " + letra);
	
	}

}
