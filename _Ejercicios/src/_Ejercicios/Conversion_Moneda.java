package _Ejercicios;

public class Conversion_Moneda {

	public static void main(String[] args) {
		
		double dolar;
		dolar = 5;
		final double TASA = 0.85;
		double euros;
		euros = (dolar * TASA);
		System.out.println(euros + "€");

	}

}
