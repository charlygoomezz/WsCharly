
public class Procesador {
	private String marca;
	private String modelo;
	private int numeroNucleos;
	private double precio;
	
	public Procesador() {
		super();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeroNucleos() {
		return numeroNucleos;
	}

	public void setNumeroNucleos(int numeroNucleos) {
		this.numeroNucleos = numeroNucleos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Procesador [maarca=" + marca + ", modelo=" + modelo + ", numeroNucleos=" + numeroNucleos + ", precio="
				+ precio + "]";
	}
	
	
}
