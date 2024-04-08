package actividad_16;

public class TarjetaGrafica {
	private String marca;
	private String modelo;
	private int nucleosCUDA;
	private double precio;
	private MemoriaRAM memoriaRAM;
	
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
	public MemoriaRAM getMemoriaRAM() {
		return memoriaRAM;
	}
	public void setMemoriaRAM(MemoriaRAM memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}
	@Override
	public String toString() {
		return "TarjetaGrafica [marca=" + marca + ", modelo=" + modelo + ", nucleosCUDA=" + nucleosCUDA + ", precio="
				+ precio + ", memoriaRAM=" + memoriaRAM + "]";
	}
	

	
	
	
	
}
