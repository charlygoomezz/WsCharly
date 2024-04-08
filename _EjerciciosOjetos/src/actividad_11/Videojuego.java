package actividad_11;

public class Videojuego {
	public long id;
	public String nombre;
	public double puntuacion;
	public double precio;
	public String fecha;
	public boolean esSegundaMano;
	
	public Videojuego() {
		super();
		this.fecha = "01/01/1970";
	}
	
	public Videojuego(long id, String nombre, double puntuacion, double precio, String fecha, boolean esSegundaMano) {
		this.id = id;
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.precio = precio;
		this.fecha = fecha;
		this.esSegundaMano = esSegundaMano;
		
	}
	
	public Videojuego(String nombre, String fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
		
	}
	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", nombre=" + nombre + ", puntuacion=" + puntuacion + ", precio=" + precio
				+ ", fecha=" + fecha + ", esSegundaMano=" + esSegundaMano + "]";
	}
	public void mostrarDatos() {
		System.out.println("Videojuego [id=" + id + ", nombre=" + nombre + ", puntuacion=" + puntuacion + ", precio=" + precio
				+ ", fecha=" + fecha + ", esSegundaMano=" + esSegundaMano + "]");
	}
	
	public void mostrarNombreYPuntuacion() {
		System.out.println("Videojuego [nombre=" + nombre + 
				", puntuacion=" + puntuacion + "]");
	}
	public void mostrarPrecioLibras() {
		double libras = precio * 0.85;
		System.out.println("El precio en libras es : " + libras);
	}
	public void mostrarFechaInvertida() {
		String[] fechaPartida = this.fecha.split("/");
		String dia = fechaPartida[0];
		String mes = fechaPartida[1];
		String anio = fechaPartida[2];
		
		String fechaInvertida = anio + "-" + mes + "-" + dia;
		System.out.println(fechaInvertida);
	}
	public double calcularDescuento() {
		double precioConDescuento = 0;
		if(this.esSegundaMano) {
			precioConDescuento = this.precio * 0.7;
		}else{
			System.out.println("El juego no tiene descuento");
		}
		return precioConDescuento;
		
	}
	public void esAptoParaJugar() {
		if(this.puntuacion >= 5) {
			System.out.println("¿Es apto para jugar!");
		}else {
			System.out.println("No es apto para jugar");
		}
	}
	public boolean esMasCaro(Videojuego videojuego) {
		if(this.precio > videojuego.precio) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
