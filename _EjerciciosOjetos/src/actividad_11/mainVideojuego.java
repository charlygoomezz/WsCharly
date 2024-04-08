package actividad_11;

import java.util.Scanner;

public class mainVideojuego {

	public static void main(String[] args) {
		
		Videojuego v1 = new Videojuego();
		Videojuego v2 = new Videojuego("Assassin Creed", "12/02/2007");
		Videojuego v3 = new Videojuego(3, "Baldurs Gate III", 10, 59.95, "03/08/2023", true);
		
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
	        
		v1.mostrarDatos();
		v2.mostrarDatos();
		v3.mostrarDatos();
		
		v1.mostrarNombreYPuntuacion();
		v2.mostrarNombreYPuntuacion();
		v3.mostrarNombreYPuntuacion();
		
		v1.mostrarPrecioLibras();
		v2.mostrarPrecioLibras();
		v3.mostrarPrecioLibras();
		
		v1.mostrarFechaInvertida();
		v2.mostrarFechaInvertida();
		v3.mostrarFechaInvertida();
		
		v1.calcularDescuento();
		v2.calcularDescuento();
		v3.calcularDescuento();
		
		v1.esAptoParaJugar();
		v2.esAptoParaJugar();
		v3.esAptoParaJugar();
		
		boolean esMasCaro = v1.esMasCaro(v3);
		System.out.println(esMasCaro);
		
		
		
		
		

	}
	

}
