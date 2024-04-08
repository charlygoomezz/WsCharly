package actividad20_;

public class Jardin {
	private double m2;
	private int numeroPlantas;
	
	public Jardin() {
		super();
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public int getNumeroPlantas() {
		return numeroPlantas;
	}

	public void setNumeroPlantas(int numeroPlantas) {
		this.numeroPlantas = numeroPlantas;
	}

	@Override
	public String toString() {
		return "Jardin [m2=" + m2 + ", numeroPlantas=" + numeroPlantas + "]";
	}
	
	

}
