package actividad_14;

import java.util.Arrays;

public class Equipo {
    String nombre;
    String[] jugadores;

    // Constructor sin parámetros
    public Equipo() {
        this.nombre = "Equipo sin nombre";
        this.jugadores = new String[0];
    }

    // Constructor con parámetros
    public Equipo(String nombre, String[] jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    // Método para mostrar todos los datos del equipo
    @Override
 	public String toString() {
 		return "Equipo [nombre=" + nombre + ", jugadores=" + Arrays.toString(jugadores) + "]";
 	}

    // Método para mostrar todos los jugadores del equipo
    public void mostrarJugadores() {
        System.out.println("Lista de jugadores del equipo " + nombre + ":");
        for (String jugador : jugadores) {
            System.out.println(jugador);
        }
    }

	// Método para verificar si un jugador existe en el equipo
    public boolean existeJugador(String jugador) {
        for (String nombreJugador : jugadores) {
            if (nombreJugador.equalsIgnoreCase(jugador)) {
                return true;
            }
        }
        return false;
    }

    // Método para devolver el número de jugadores del equipo
    public int numeroDeJugadores() {
        int contadorJugadores = 0;
        for(String j : jugadores){
        	if(j != null) {
        		contadorJugadores++;
        	}
        }
        return contadorJugadores;
    }

    // Método para verificar si el equipo es apto para jugar
    public boolean esAptoParaJugar() {
        if(numeroDeJugadores() > 6) {
        	return true;
        }
        return false;
    }

    // Método para verificar si dos listas de jugadores son iguales
    public boolean mismaListaDeJugadores(Equipo segundoEquipo) {
    	if (this.jugadores.length != segundoEquipo.jugadores.length) {
    		return false;
    	}
    	
    	boolean esIgual = false;
    	for(String otroJugador : segundoEquipo.jugadores) {
    		if(existeJugador(otroJugador)) {
    			continue;	
    		}else {
    			return false;
    		}
    	}
    	return true;
    	
       
    }

    // Método para verificar si dos equipos son exactamente iguales
    public boolean equiposIguales (Equipo segundoEquipo) {
		if (this.nombre.equalsIgnoreCase(segundoEquipo.nombre)
				&& mismaListaDeJugadores(segundoEquipo)) {
			return true;
		}
		return false;
	}
    
}
