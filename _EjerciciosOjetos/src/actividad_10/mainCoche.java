package actividad_10;

public class mainCoche {

	public static void main(String[] args) {
		Coche c1 = new Coche();
		c1.marca = "Toyota";
		c1.modelo = "Corolla";
		c1.matricula = "xyz-123";
		c1.peso = 500;
		c1.añosAntiguedad = 5;
		c1.esElectrico = false;
		
		imprimirCoche(c1);

	}
	public static void imprimirCoche(Coche coche) {
		System.out.println("Las características del coche son:");
		System.out.println(coche.modelo);
		System.out.println(coche.marca);
		System.out.println(coche.matricula);
		System.out.println(coche.peso);
		System.out.println(coche.añosAntiguedad);
		System.out.println(coche.esElectrico);
		
	}

}
