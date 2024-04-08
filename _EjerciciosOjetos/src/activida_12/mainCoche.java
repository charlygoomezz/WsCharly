package activida_12;

public class mainCoche {

	public static void main(String[] args) {
		Coche c1 = new Coche(21233,"Mazda","sys65",13000,"21/02/1999",55000);
		Coche c2 = new Coche(21233,"Skoda","k2931",22000,"21/03/2010",35000);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		c1.mostrarPrecioBase();
		c2.mostrarPrecioBase();
		
		c1.mostrarAnioMatriculacion();
		c2.mostrarAnioMatriculacion();
		
		c1.esAñoBisiesto();
		c2.esAñoBisiesto();
		
		System.out.println(c1.precioFinal());
		System.out.println(c2.precioFinal());
		
		System.out.println(c1.esPrimo());
		System.out.println(c2.esPrimo());
		
		System.out.println(c1.cuantoFalta());
		System.out.println(c2.cuantoFalta());
		
		c1.cuantosCaracteresMarcaYModelo();
		c2.cuantosCaracteresMarcaYModelo();
		
		System.out.println(c1.diferenciaKilometros(c2));
		System.out.println(c1.esMasCaro(c2));
	}

}
