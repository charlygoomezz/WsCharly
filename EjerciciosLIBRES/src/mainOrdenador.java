import java.util.ArrayList;

public class mainOrdenador {

	public static void main(String[] args) {
		Procesador p1 = new Procesador();
		p1.setMarca("Intel");
		p1.setModelo("i7");
		p1.setNumeroNucleos(5);
		p1.setPrecio(500);
		
		PlacaBase pb = new PlacaBase();
		pb.setMarca("ITX");
		pb.setTipo("mamama");
		pb.setPrecio(70);
		
		MemoriaRAM r1 = new MemoriaRAM();
		r1.setMarca("sonchis");
		r1.setCapacidad(8);
		r1.setPrecio(50);
		
		MemoriaRAM r2 = new MemoriaRAM();
		r1.setMarca("sonchis");
		r1.setCapacidad(16);
		r1.setPrecio(60);
		
		MemoriaRAM ramTG1 = new MemoriaRAM();
		r1.setMarca("sonchis");
		r1.setCapacidad(8);
		r1.setPrecio(30);
		
		Perifericos pf1 = new Perifericos();
		pf1.setMarca("logitech");
		pf1.setTipo("Teclado");
		pf1.setPrecio(30);
		
		Perifericos pf2 = new Perifericos();
		pf1.setMarca("logitech");
		pf1.setTipo("Raton");
		pf1.setPrecio(20);
		
		Perifericos pf3 = new Perifericos();
		pf1.setMarca("logitech");
		pf1.setTipo("Altavoz");
		pf1.setPrecio(50);
		
		TarjetaGrafica tg1 = new TarjetaGrafica();
		tg1.setMarca("NVIDIA");
		tg1.setModelo("TFX-3000");
		tg1.setNucleosCUDA(4);
		tg1.setPrecio(500);
		tg1.setRam(ramTG1);
		
		ArrayList<MemoriaRAM> listaMemoriaRAMOrdenador = new ArrayList<MemoriaRAM>();
		listaMemoriaRAMOrdenador.add(r1);
		listaMemoriaRAMOrdenador.add(r2);
		
		ArrayList<Perifericos> listaPerifericosOrdenador = new ArrayList<Perifericos>();
		listaPerifericosOrdenador.add(pf1);
		listaPerifericosOrdenador.add(pf2);
		listaPerifericosOrdenador.add(pf3);
		
		Ordenador o = new Ordenador();
		o.setListaMemoriaRAM(listaMemoriaRAMOrdenador);
		o.setListaPerifericos(listaPerifericosOrdenador);
		o.setPlacaBase(pb);
		o.setProcesador(p1);
		o.setTarjetaGrafica(tg1);
		o.calcularPrecio();
		
		System.out.println("El precio del ordenador sera: " + o);
		
		
		
		
		

	}

}
