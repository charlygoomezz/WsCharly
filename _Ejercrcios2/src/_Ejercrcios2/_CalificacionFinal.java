package _Ejercrcios2;

import java.util.Scanner;

public class _CalificacionFinal {

	public static void main(String[] args) {
		System.out.println("NOTA FINAL EN ENTORNOS DE DESARROLLO");
		System.out.println("(Es necesario introducir valores de 1 a 10, y decimales si es necesario)");
		Scanner sc = new Scanner(System.in);
		
		//EXAMENES PARCIALES
		System.out.println("Introduzca la nota del primer examen parcial: ");
		double nota1 = sc.nextDouble();
		System.out.println("Introduzca la nota del segundor examen parcial: ");
		double nota2 = sc.nextDouble();
		System.out.println("Introduzca la nota del tercer examen parcial: ");
		double nota3 = sc.nextDouble();
		System.out.println("------------------");
		double notaParcial = (nota1 + nota2 + nota3) / 3;
		double npf = notaParcial * (0.55);
		System.out.println("LA MEDIA DE LOS PARCIALES ES: " + npf);
		System.out.println("------------------");
		
		//EXAMEN FINAL
		System.out.println("Introduzca la nota del examen final: ");
		double notaf = sc.nextDouble();
		System.out.println("------------------");
		double notaFinal = notaf * (0.3);
		System.out.println("LA MEDIA DEL EXAMEN FINAL ES: " + notaFinal);
		System.out.println("------------------");
			
		//TRABAJO FINAL
		System.out.println("Introduzca la nota del trabajo final:");
		double tf = sc.nextDouble();
		System.out.println("------------------");
		double trabajoFinal = tf * (0.15);
		System.out.println("LA MEDIA DEL TRABAJO FINAL ES: " + trabajoFinal);
		System.out.println("------------------");
		
		//CALIFICAION FINAL
		double rf = npf + notaFinal + trabajoFinal;
		System.out.println("LA NOTA DE ENTORNOS DE DESARROLLO ES: " + rf);
			
	

	}

}
