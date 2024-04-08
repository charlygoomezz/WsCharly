package _EjerciciosSentenciasControl;

import java.util.Scanner;

public class _JuegoNumeroMayor {
	// Desarrolla un algoritmo que determine cual es el mayor de los números ingresados 
	//por teclado. El programa pedirá un número y tendrá que valorar si es el mayor. 
	//El programa continuará pidiendo números hasta se ingrese un número negativo y 
	//acabará mostrando el número mayor.

	 public static void main(String[] args) {
		 	System.out.println("Bienvenido a la aplicación NUMERO MAYOR");
			System.out.println("---------------------------------------");
			System.out.println("---------------------------------------");
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Ingrese un número (ingrese un número negativo para terminar): ");
	        int numero = sc.nextInt();
	        int numeroMayor = numero;

	       
	        while (numero >= 0) {
	            
	            if (numero > numeroMayor) {
	                System.out.println(numero + " es mayor que " + numeroMayor );
	            }

	            System.out.print("Ingrese otro número (ingrese un número negativo para terminar): ");
	            numero = sc.nextInt();

	            if (numero >= 0 && numero > numeroMayor) {
	            	numeroMayor = numero;
	            }
	        }System.out.println("El número mayor es: " + numeroMayor);

	        
	    }
	}
		

		

	       

	       
	      