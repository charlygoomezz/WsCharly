package _EjerciciosOjetos;

public class _actividad10Coches {

	public static void main(String[] args) {
		
		Coche c1 = new Coche();
		c1.marca = "Aston Martin";
		c1.modelo = "RX34";
		c1.matricula = "2345 YTR";
		c1.peso = 300;
		c1.esElectrico = false;
		c1.añosAntiguedad = 2;
		
		Coche c2 = new Coche();
		c2.marca = "Jaguar";
		c2.modelo = "TRX34";
		c2.matricula = "9876 MHU";
		c2.peso = 400;
		c2.esElectrico = true;
		c2.añosAntiguedad = 4;
		
		Coche c3 = new Coche();
		c3.marca = "Lamborghini";
		c3.modelo = "Murcielago";
		c3.matricula = "7777 ZLA";
		c3.peso = 500;
		c3.esElectrico = false;
		c3.añosAntiguedad = 5;
		
		imprimir(c1);
		imprimir(c2);
		imprimir(c3);
		
		

	}
	public static void imprimir(Coche coche) { //la primera palabra coche represanta el tipo de dato, la segunda representa la referencia
		System.out.println(coche.marca);
		System.out.println(coche.modelo);
		System.out.println(coche.matricula);
		System.out.println(coche.peso);
		System.out.println(coche.esElectrico);
		System.out.println(coche.añosAntiguedad);
	} 

}
