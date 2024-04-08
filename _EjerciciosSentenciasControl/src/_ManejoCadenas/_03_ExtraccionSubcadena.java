package _ManejoCadenas;

import java.util.Scanner;

public class _03_ExtraccionSubcadena {
	//Pide al usuario que ingrese una cadena y dos índices. 
	//Luego, muestra la subcadena comprendida entre esos dos índices.

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación EXTRACCIÓN DE SUBCADENA");
		System.out.println("---------------------------------------------------");
		System.out.println("---------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una frase: ");
		String cadena = sc.nextLine();
		System.out.println("Introduzca el primer índice: ");
		int indice1 = sc.nextInt();
		System.out.println("Introduzca el segundo índice: ");
		int indice2 = sc.nextInt();
		
		
        if (indice1 >= 0 && indice2 < cadena.length() && indice1 <= indice2) {
            
            String subcadena = cadena.substring(indice1, indice2 + 1);

            System.out.println("La subcadena entre los índices " + indice1 + " y " + indice2 + " es: " + subcadena);
        } else {
            
            System.out.println("Los índices no son válidos.");
        }
	}

}
