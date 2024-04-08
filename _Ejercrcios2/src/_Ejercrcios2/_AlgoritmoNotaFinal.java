package _Ejercrcios2;

import java.util.Scanner;

public class _AlgoritmoNotaFinal {

	public static void main(String[] args) {
		System.out.println("CALCULA TU NOTA FINAL AQUI!!");
		System.out.println("La nota se basa en 100 preguntas");
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------");
		
		//RESPUESTA CORRECTAS
		System.out.println("Introduzca el número total de respuestas acertads: ");
		int aciertos = sc.nextInt();
		
		//RESPUESTA INCORRECTAS
		System.out.println("Introduzca el número total de respuestas incorrectas: ");
		int fallos = sc.nextInt();
		
		//RESPUESTAS NO CONTESTADAS
		System.out.println("Introduzca el numero total de preguntas no contestadas: ");
		int no = sc.nextInt();
		System.out.println("------------------");
		
		//RESULTADO EXAMEN
		int respuestas = (aciertos * 5) - (fallos * 1) + (no * 0);
		System.out.println("LA CALIFICACION DEL EXAMEN ES: " + respuestas + "/100");
	}

}
