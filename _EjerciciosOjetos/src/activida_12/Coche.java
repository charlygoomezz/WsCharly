package activida_12;

public class Coche {
	public long id;
	public String marca;
	public String modelo;
	public double precio;
	public String fechaMatriculacion;
	public double kilometros;
	
	public Coche() {
		super();
		this.marca = "";
		this.modelo = "";
	}
	public Coche(int id, String marca, String modelo, double precio, String fechaMatriculacion, double kilometros) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.fechaMatriculacion = fechaMatriculacion;
		this.kilometros = kilometros;
	}
	@Override
	public String toString() {
		return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
				+ ", fechaMatriculacion=" + fechaMatriculacion + ", kilometros=" + kilometros + "]";
	}
	
	public void mostrarPrecioBase() {
		System.out.println(this.precio);
	}
	public void mostrarAnioMatriculacion() {
		String[] fechaMatriculacion = this.fechaMatriculacion.split("/");
		String anio = fechaMatriculacion[2];
		
		System.out.println(anio);
	}
	public void esAñoBisiesto() {
		int añoDeMatriculacion = Integer.parseInt(this.fechaMatriculacion.substring(6,10));
		boolean esBisiesto = 
				añoDeMatriculacion % 4 == 0 
					&& (añoDeMatriculacion % 100 != 0 || añoDeMatriculacion % 400 == 0);
		if(esBisiesto) {
			System.out.println("El año es bisiesto");
		}else {
			System.out.println("El año NO es bisiesto");
		}
	}
	public double precioFinal() {
		double precioBase = this.precio;
		if(this.kilometros < 10000) {
			return this.precio;
		}else if(this.kilometros >= 10000 && this.kilometros <= 50000) {
			return this.precio * 0.8;
		}else {
			return this.precio * 0.5;
		}
		
	}
	public boolean esPrimo() {
		boolean esPrimo = true;
		int kilometros = (int)this.kilometros;
		
		if(kilometros <= 0) {
			return false;
		}
		
		for (int i = 2; i < kilometros; i++) {
			if (kilometros % i == 0) {
				esPrimo = false;
				break;
			}
		}
		
		return esPrimo;
	}
		
	public double cuantoFalta(){
		return 200000 - this.kilometros;
		
	}
	public void cuantosCaracteresMarcaYModelo() {
		int numeroCaracters = this.marca.length() + this.modelo.length();
		System.out.println(numeroCaracters);
	}
	public double diferenciaKilometros(Coche coche) {
		double diferencia = this.kilometros - coche.kilometros;
		return diferencia;
	}
	public boolean esMasCaro(Coche coche) {
		if(this.precio > coche.precio) {
			return true;
		}else {
			return false;
		}
		
	}
}

