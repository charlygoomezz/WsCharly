package actividad20_;

public class Habitacion {
	private String nombre;
	private int m2;
	private TipoHabitacion tipoHabitacion;
	
	public Habitacion() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public TipoHabitacion getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	@Override
	public String toString() {
		return "Habitacion [nombre=" + nombre + ", m2=" + m2 + ", tipoHabitacion=" + tipoHabitacion + "]";
	}
	
	

}
