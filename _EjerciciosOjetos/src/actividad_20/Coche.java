package actividad_20;

public class Coche {
	private int id;
	private String matricula;
	private String marca;
	
	private static int contadorID;
	
	public static final String TOYOTA = "Toyota";
	public static final String RENAULT = "Renault";
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getId() {
		return id;
	}
	public static int getContadorID() {
		return contadorID;
	}
	public Coche() {
		this.id = contadorID;
		contadorID++;
		}
	
	@Override
	public String toString() {
		return "Coche [id=" + id + ", matricula=" + matricula + ", marca=" + marca + "]";
	}
	
	public static void mostrarContadorID() {
		System.out.println(contadorID);
	}
	
	public static void resetearContadorID() {
		contadorID = 0;
	}
}

