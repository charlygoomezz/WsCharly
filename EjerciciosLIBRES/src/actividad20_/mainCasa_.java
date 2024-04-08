package actividad20_;

import java.util.ArrayList;


public class mainCasa_ {

	public static void main(String[] args) {
		Direccion d1 = new Direccion();
		d1.setTipoVia(TipoVia.AVENIDA);
		d1.setNombreVia("Valle del Oro");
		d1.setLocalidad("Madrid");
		d1.setCp("28042");
		
		Direccion d2 = new Direccion();
		d2.setTipoVia(TipoVia.PASEO);
		d2.setNombreVia("Valle del Mortis");
		d2.setLocalidad("Madrid");
		d2.setCp("28047");
		
		Jardin j1 = new Jardin();
		j1.setM2(10);
		j1.setNumeroPlantas(2);
		
		
		Habitacion h1 = new Habitacion();
		h1.setM2(15);
		h1.setNombre("Cocina");
		h1.setTipoHabitacion(TipoHabitacion.COCINA);
		
		Habitacion h2 = new Habitacion();
		h1.setM2(10);
		h1.setNombre("Baño");
		h1.setTipoHabitacion(TipoHabitacion.BANIO);
		
		Habitacion h4 = new Habitacion();
		h4.setM2(16);
		h4.setNombre("Salon");
		h4.setTipoHabitacion(TipoHabitacion.SALON);
		
		Habitacion h3 = new Habitacion();
		h3.setM2(12);
		h3.setNombre("Sala de estar");
		h3.setTipoHabitacion(TipoHabitacion.SALA_DE_ESTAR);
		
		ArrayList<Habitacion> listaHabitaciones1 = new ArrayList<Habitacion>();
		listaHabitaciones1.add(h1);
		listaHabitaciones1.add(h2);
		
		ArrayList<Habitacion> listaHabitaciones2 = new ArrayList<Habitacion>();
		listaHabitaciones2.add(h3);
		listaHabitaciones2.add(h4);
		
		Casa c1 = new Casa();
		c1.setPrecio(200000);
		c1.setDireccion(d1);
		c1.setEsSegundaMano(true);
		c1.setJardin(j1);
		c1.setListaHabitaciones(listaHabitaciones1);
		
		System.out.println(c1.toString());
		
		c1.calcularMetrosTotales();
		System.out.println("¿La casa es chalet?: " + c1.esChalet());
		System.out.println(c1.precioFinalCasa());
		
	
		

	}

}
