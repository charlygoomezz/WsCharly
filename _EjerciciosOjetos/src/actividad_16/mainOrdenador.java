package actividad_16;

import java.util.ArrayList;


public class mainOrdenador {

	public static void main(String[] args) {
		Procesador p1 = new Procesador();
		p1.setMarca("Muñoneitor");
		p1.setModelo("Flammer 2000");
		p1.setNumeroNucleos(2);
		p1.setPrecio(200);
		
		PlacaBase pb1 = new PlacaBase();
		pb1.setMarca("iAmANoob");
		pb1.setTipo("ATX");
		pb1.setPrecio(100);
		
		MemoriaRAM ramOrdenador1 = new MemoriaRAM();
		ramOrdenador1.setMarca("Muñonen");
		ramOrdenador1.setCapacidad(8);
		ramOrdenador1.setPrecio(50);
		
		MemoriaRAM ramOrdenador2 = new MemoriaRAM();
		ramOrdenador2.setMarca("Muñonen");
		ramOrdenador2.setCapacidad(8);
		ramOrdenador2.setPrecio(50);
		
		MemoriaRAM ramTg1 = new MemoriaRAM();
		ramTg1.setMarca("Manquer");
		ramTg1.setCapacidad(16);
		ramTg1.setPrecio(120);
		
		TarjetaGrafica tg1 = new TarjetaGrafica();
		tg1.setMarca("Flaming");
		tg1.setModelo("Special Muñon Edition");
		tg1.setNucleosCUDA(5600);
		tg1.setPrecio(3000);
		tg1.setMemoriaRAM(ramTg1);
		
		Periferico peri1 = new Periferico();
		peri1.setMarca("Flfaming");
		peri1.setTipo("Monitor");
		peri1.setPrecio(300);
		
		Periferico peri2 = new Periferico();
		peri2.setMarca("Flfaming");
		peri2.setTipo("Teclado");
		peri2.setPrecio(79);
		
		Periferico peri3 = new Periferico();
		peri3.setMarca("Flfaming");
		peri3.setTipo("Raton");
		peri3.setPrecio(75);
		
		ArrayList<MemoriaRAM> listaRAMOrdenador = new ArrayList<MemoriaRAM>();
		listaRAMOrdenador.add(ramOrdenador1);
		listaRAMOrdenador.add(ramOrdenador2);
		
		ArrayList<Periferico> listaPerifericosOrdenador =
				new ArrayList<Periferico>();
		listaPerifericosOrdenador.add(peri1);
		listaPerifericosOrdenador.add(peri2);
		listaPerifericosOrdenador.add(peri3);
		
		Ordenador o1 = new Ordenador();
		o1.setPerifericos(listaPerifericosOrdenador);
		o1.setMemoriaRAM(listaRAMOrdenador);
		o1.setPlacaBase(pb1);
		o1.setProcesador(p1);
		o1.setTarjetaGrafica(tg1);
		o1.precioFinal();
		
		System.out.println(o1);
	}
}
