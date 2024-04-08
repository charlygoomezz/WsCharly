package actividad_16;

import java.util.ArrayList;

public class Ordenador {
	
	private double precio;
	private Procesador procesador;
	private PlacaBase placaBase;
	private TarjetaGrafica tarjetaGrafica;
	private ArrayList<MemoriaRAM> listaRAM;
	private ArrayList<Periferico> listaPerifericos;
	
	
	

	@Override
	public String toString() {
		return "Ordenador [precio=" + precio + ", procesador=" + procesador + ", placaBase=" + placaBase
				+ ", tarjetaGrafica=" + tarjetaGrafica + ", memoriaRAM=" + listaRAM + ", perifericos=" + listaPerifericos
				+ "]";
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

	public PlacaBase getPlacaBase() {
		return placaBase;
	}

	public void setPlacaBase(PlacaBase placaBase) {
		this.placaBase = placaBase;
	}

	public TarjetaGrafica getTarjetaGrafica() {
		return tarjetaGrafica;
	}

	public void setTarjetaGrafica(TarjetaGrafica tarjetaGrafica) {
		this.tarjetaGrafica = tarjetaGrafica;
	}

	public ArrayList<MemoriaRAM> getMemoriaRAM() {
		return listaRAM;
	}

	public void setMemoriaRAM(ArrayList<MemoriaRAM> memoriaRAM) {
		this.listaRAM = memoriaRAM;
	}

	public ArrayList<Periferico> getPerifericos() {
		return listaPerifericos;
	}

	public void setPerifericos(ArrayList<Periferico> perifericos) {
		this.listaPerifericos = perifericos;
	}
	
	public void precioFinal() {
        double precioRam = 0;
        double precioPerifericos = 0;
        for (MemoriaRAM m : listaRAM) {
            precioRam += m.getPrecio();
        }
        
        for (Periferico m : listaPerifericos) {
            precioPerifericos += m.getPrecio();
        }
        
        this.precio = procesador.getPrecio() + placaBase.getPrecio() + tarjetaGrafica.getPrecio() + precioRam + precioPerifericos;
        
	
	}
}
