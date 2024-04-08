package _ManejoCadenas;

import java.util.Scanner;

public class _09_ConteoDeCaracteres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine();

        
        System.out.print("Ingresa el carácter a contar: ");
        char caracter = sc.next().charAt(0);

        int contador = contarCaracteres(cadena, caracter);

        System.out.println("El carácter '" + caracter + "' aparece " + contador + " veces en la cadena.");
    }

    private static int contarCaracteres(String cadena, char caracter) {
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }

        return contador;
    }
}