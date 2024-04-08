package actividad_16;

public class PlacaBase {
	private String marca;
	private String tipo;
	private double precio;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "PlacaBase [marca=" + marca + ", tipo=" + tipo + ", precio=" + precio + "]";
	}
	
	
	
}
