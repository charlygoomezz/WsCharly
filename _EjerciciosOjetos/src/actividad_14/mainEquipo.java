package actividad_14;

import java.util.Scanner;

public class mainEquipo {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        // Crear los equipos con los valores introducidos por teclado
	        Equipo[] equipos = new Equipo[2];
	        for (int i = 0; i < equipos.length; i++) {
	            System.out.println("Introduce el nombre del equipo " + (i + 1) + ":");
	            String nombreEquipo = scanner.nextLine();
	            System.out.println("Introduce los nombres de los jugadores del equipo " + (i + 1) + ": (separados por comas)");
	            String[] nombresJugadores = scanner.nextLine().split(",");
	            equipos[i] = new Equipo(nombreEquipo, nombresJugadores);
	        }

	        // Invocar todos los métodos para cada equipo
	        for (Equipo equipo : equipos) {
	            System.out.println("\nDatos del equipo:");
	            System.out.println(equipo.toString());

	            equipo.mostrarJugadores();

	            System.out.println("¿Existe el jugador 'Juan' en el equipo? " + equipo.existeJugador("Juan"));

	            System.out.println("Número de jugadores en el equipo: " + equipo.numeroDeJugadores());

	            System.out.println("¿Es apto para jugar? " + equipo.esAptoParaJugar());

	            String[] mismaLista = equipo.jugadores.clone();
	            System.out.println("¿La lista de jugadores es igual a la lista del equipo? " + equipo.mismaListaDeJugadores(equipo));

	            Equipo equipoIgual = new Equipo(equipo.nombre, equipo.jugadores.clone());
	            System.out.println("¿El equipo es igual al mismo equipo? " + equipo.equals(equipoIgual));
	        }


	    }
	}