package actividad16_;

import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private ArrayList<String>listaJugadores;
	
	public Equipo() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(ArrayList<String> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", listaJugadores=" + listaJugadores + "]";
	}
	
	public void mostraJugadores(){
		for(String j : listaJugadores) {
			System.out.println(j);
		}
	}
	public boolean existeJugador(String jugador) {
		if(this.nombre == jugador) {
			return true;
		}
		return false;
	}
	public int numeroJugadores() {
		int jugadores = 0;
		for(String j : listaJugadores) {
			if(j != null)
			jugadores++;
		}
		return jugadores;
	}
	public boolean esApto() {
		if(numeroJugadores() > 6) {
			return true;
		}
		return false;
	}
	public boolean listasIguales(Equipo lista) {
		if(this.listajugadores.length != lista.listaJugadores.lenght) {
			
		}
		
	}

}
