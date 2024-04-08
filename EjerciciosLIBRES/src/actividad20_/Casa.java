package actividad20_;

import java.util.ArrayList;

public class Casa {
	private Direccion direccion;
	private double precio;
	private boolean esSegundaMano;
	private double m2;
	private Jardin jardin;
	private ArrayList<Habitacion> listaHabitaciones;
	
	public Casa() {
		super();
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isEsSegundaMano() {
		return esSegundaMano;
	}

	public void setEsSegundaMano(boolean esSegundaMano) {
		this.esSegundaMano = esSegundaMano;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public Jardin getJardin() {
		return jardin;
	}

	public void setJardin(Jardin jardin) {
		this.jardin = jardin;
	}

	public ArrayList<Habitacion> getListaHabitaciones() {
		return listaHabitaciones;
	}

	public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}

	@Override
	public String toString() {
		return "Casa [direccion=" + direccion + ", precio=" + precio + ", esSegundaMano=" + esSegundaMano + ", m2=" + m2
				+ ", jardin=" + jardin + ", listaHabitaciones=" + listaHabitaciones + "]";
	}
	
	public void calcularMetrosTotales(){
		double metrosTotales = 0;
		if (!(this.jardin == null)) {
			metrosTotales += this.jardin.getM2();
		}
		for(Habitacion h : listaHabitaciones) {
			metrosTotales += h.getM2();
		}
		this.m2 = metrosTotales;
		System.out.println("Los metros totales de la casa son : " + metrosTotales);
	}
	
	public boolean esChalet() {
		if(this.jardin == null) {
			return false;
		}
		return true;
	}
	public double precioFinalCasa() {
		double precioFinal = 0;
		if(this.esSegundaMano == true) {
			precioFinal = this.precio + (this.precio * 0.05);			
		}else {
			precioFinal = this.precio + (this.precio * 0.1);
		}
		return precioFinal;
	}

}
