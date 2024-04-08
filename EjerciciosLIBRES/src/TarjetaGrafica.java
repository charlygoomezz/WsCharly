
public class TarjetaGrafica {
	private String marca;
	private String modelo;
	private int nucleosCUDA;
	private double precio;
	private MemoriaRAM ram;
	
	public TarjetaGrafica() {
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

	public int getNucleosCUDA() {
		return nucleosCUDA;
	}

	public void setNucleosCUDA(int nucleosCUDA) {
		this.nucleosCUDA = nucleosCUDA;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public MemoriaRAM getRam() {
		return ram;
	}

	public void setRam(MemoriaRAM ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "TarjetaGrafica [marca=" + marca + ", modelo=" + modelo + ", nucleosCUDA=" + nucleosCUDA + ", precio="
				+ precio + ", ram=" + ram + "]";
	}
	
	
}
