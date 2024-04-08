import java.util.ArrayList;

public class Ordenador {
	private double precio;
	private Procesador procesador;
	private TarjetaGrafica tarjetaGrafica;
	private PlacaBase placaBase;
	private ArrayList<MemoriaRAM> listaMemoriaRAM;
	private ArrayList<Perifericos> listaPerifericos;
	
	public Ordenador() {
		super();
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public TarjetaGrafica getTarjetaGrafica() {
		return tarjetaGrafica;
	}

	public void setTarjetaGrafica(TarjetaGrafica tarjetaGrafica) {
		this.tarjetaGrafica = tarjetaGrafica;
	}

	public PlacaBase getPlacaBase() {
		return placaBase;
	}

	public void setPlacaBase(PlacaBase placaBase) {
		this.placaBase = placaBase;
	}

	public ArrayList<MemoriaRAM> getListaMemoriaRAM() {
		return listaMemoriaRAM;
	}

	public void setListaMemoriaRAM(ArrayList<MemoriaRAM> listaMemoriaRAM) {
		this.listaMemoriaRAM = listaMemoriaRAM;
	}

	public ArrayList<Perifericos> getListaPerifericos() {
		return listaPerifericos;
	}

	public void setListaPerifericos(ArrayList<Perifericos> listaPerifericos) {
		this.listaPerifericos = listaPerifericos;
	}

	@Override
	public String toString() {
		return "Ordenador [precio=" + precio + ", procesador=" + procesador + ", tarjetaGrafica=" + tarjetaGrafica
				+ ", placaBase=" + placaBase + ", listaMemoriaRAM=" + listaMemoriaRAM + ", listaPerifericos="
				+ listaPerifericos + "]";
	}
	public void calcularPrecio() {
		double precioFinal = 0;
		precioFinal += procesador.getPrecio();
		precioFinal += tarjetaGrafica.getPrecio();
		precioFinal += placaBase.getPrecio();
		
		for(MemoriaRAM m : listaMemoriaRAM) {
			precioFinal += m.getPrecio();
		}
		for(Perifericos p : listaPerifericos) {
			precioFinal += p.getPrecio();
		}
		this.precio = precioFinal;
	}

}
