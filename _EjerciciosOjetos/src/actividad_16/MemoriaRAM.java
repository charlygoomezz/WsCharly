package actividad_16;

public class MemoriaRAM {
	private String marca;
	private int capacidad;
	private double precio;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "MemoriaRAM [marca=" + marca + ", capacidad=" + capacidad + ", precio=" + precio + "]";
	}
	
	
	
	

	
	

}
