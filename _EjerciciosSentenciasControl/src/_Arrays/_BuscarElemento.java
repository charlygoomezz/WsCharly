package _Arrays;

import java.util.Scanner;

public class _BuscarElemento {
	//Desarrolla un programa que permita al usuario ingresar un valor y determine si ese valor 
	//está presente en un array dado. Se tendrá que crear un array con valores al inicio del programa.

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación BUSCAR ELEMENTO");
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		
		int[] array = {2, 5, 8, 10, 15};

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        
        if (buscarEnArray(array, numero)) {
            System.out.println("El numero " + numero + " está presente en el array.");
        } else {
            System.out.println("El numero " + numero + " no está presente en el array.");
        }
    }

    
    private static boolean buscarEnArray(int[] array, int valor) {
        for (int elemento : array) {
            if (elemento == valor) {
                return true; 
            }
        }
        return false; 
    }
}
