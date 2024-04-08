package _EjerciciosOjetos;

import java.util.Scanner;

public class _actividad11 {

	public static void main(String[] args) {
		Videojuego v1 = new Videojuego();
        Videojuego v2 = new Videojuego(827397162, "Call of Duty", 8, 59.99, "15/11/2022", false);
        Videojuego v3 = new Videojuego("FIFA 23", "20/02/2023");
		
        //Constructor por defecto con valores pedidos por el usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del juego: ");
        v1.nombre = sc.nextLine();
        System.out.println("Introduce el ID del juego: ");
        v1.id = sc.nextInt();
        System.out.println("Introduce la puntuación del juego: ");
        v1.puntuacion = sc.nextInt();
        System.out.println("Introduce el precio del juego en euros: ");
        v1.precio = sc.nextDouble();
        System.out.println("¿Es de segunda mano? (true/false): ");
        v1.esSegundaMano = sc.nextBoolean();
        
        //Invocar todos los metodos:
        
        //Metodo mostrar datos por pantalla
        System.out.println("-----------------------");
        System.out.println("Datos del Juego 1:");
        v1.mostrarDatos();
        System.out.println("Datos del Juego 2:");
        v2.mostrarDatos();
        System.out.println("Datos del Juego 3:");
        v3.mostrarDatos();
        System.out.println("-----------------------");

        //Metodo Nombre y Puntuacion
        System.out.println("Nombre y Puntuación del Juego 1:");
        v1.mostrarNombreYPuntuacion();
        System.out.println("Nombre y Puntuación del Juego 2:");
        v2.mostrarNombreYPuntuacion();
        System.out.println("Nombre y Puntuación del Juego 3:");
        v3.mostrarNombreYPuntuacion();
        System.out.println("-----------------------");
        
        //Metodo Precio en Libras
        System.out.println("Precio en Libras del Juego 1:");
        v1.convertirPrecioEnLibras();
        System.out.println("Precio en Libras del Juego 2:");
        v2.convertirPrecioEnLibras();
        System.out.println("Precio en Libras del Juego 3:");
        v3.convertirPrecioEnLibras();
        System.out.println("-----------------------");
        
        //Metodo Fecha Invertida
        System.out.println("La fecha invertida del Juego 1 es: ");
        v1.mostrarFechaInvertida();
        System.out.println("La fecha invertida del Juego 2 es: ");
        v2.mostrarFechaInvertida();
        System.out.println("La fecha invertida del Juego 3 es: ");
        v3.mostrarFechaInvertida();
        System.out.println("-----------------------");
        
        //Metodo Precio del juego con descuento 
        System.out.println("Precio con Descuento del Juego 1:");
        System.out.println(v1.mostrarDescuentoSegundaMano() + " €");
        System.out.println("Precio con Descuento del Juego 2:");
        System.out.println(v2.mostrarDescuentoSegundaMano() + " €");
        System.out.println("Precio con Descuento del Juego 3:");
        System.out.println(v3.mostrarDescuentoSegundaMano() + " €");
        System.out.println("-----------------------");
        
        //Metodo si el juego es apto para jugarlo
        System.out.println("¿Es apto para jugar el Juego 1?");
        System.out.println(v1.esAptoParaJugar() ? "Sí" : "No");
        System.out.println("¿Es apto para jugar el Juego 2?");
        System.out.println(v2.esAptoParaJugar() ? "Sí" : "No");
        System.out.println("¿Es apto para jugar el Juego 3?");
        System.out.println(v3.esAptoParaJugar() ? "Sí" : "No");
        System.out.println("-----------------------");
        
        //Metodo numeros naturales del 1 al 10
        System.out.println("Números Naturales hasta 10 desde la Puntuación del Juego 1:");
        v1.mostrarNumerosNaturales();
        System.out.println("Números Naturales hasta 10 desde la Puntuación del Juego 1:");
        v2.mostrarNumerosNaturales();
        System.out.println("Números Naturales hasta 10 desde la Puntuación del Juego 1:");
        v3.mostrarNumerosNaturales();
        System.out.println("-----------------------");
        
        //Metodo que juego es mas caro
        System.out.println("¿El Juego 1 es más caro que el Juego 2?");
        System.out.println(v1.esMasCaroQue(v2) ? "Sí" : "No");
        System.out.println("¿El Juego 2 es más caro que el Juego 3?");
        System.out.println(v2.esMasCaroQue(v3) ? "Sí" : "No");
        System.out.println("¿El Juego 3 es más caro que el Juego 1?");
        System.out.println(v3.esMasCaroQue(v1) ? "Sí" : "No");
        System.out.println("-----------------------");
        

	}

}
