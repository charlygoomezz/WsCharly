package _EjerciciosOjetos;

public class _videojuego {
	int id;
	String nombre;
	int puntuacion;
	double precio;
	String fechaCreacion;
	boolean esSegundaMano;
	
	//Constructor por defecto
	
	public _videojuego() {
		super();//Esto se pone apara llamar al constructor padre. Si no se pone
				//Java lo pone por nosotros.
		this.fechaCreacion = "01/01/1970";
		
	}
	//Constructor con todos los parámetros
	public _videojuego(int id,String nombre, int puntuacion,double precio,String fechaCreacion,boolean esSegundaMano) {
		this.id = id;
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.fechaCreacion = fechaCreacion;
		this.esSegundaMano = esSegundaMano;
	}
	//Constructor con nombre y fecha de creación
	public _videojuego(String nombre,String fechaCreacion) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
	}
	//Metodo mostrar datos por pantalla
	public void mostrarDatos() {
		System.out.println("ID: " + id);
		System.out.println("Nombre: " + nombre);
		System.out.println("Puntuación: " + puntuacion);
		System.out.println("Precio : " + precio + "€");
		System.out.println("Fecha de creación: " + fechaCreacion);
		System.out.println("¿Es de segunda mano?: " + esSegundaMano);
	}
	//Metodo mostrar nombre y puntuación
	public void mostrarNombreYPuntuacion() {
		System.out.println("Nombre:" + nombre);
		System.out.println("Puntuación: " + puntuacion);
	}
	//Metodo para mostrar el precio en libras
	public void convertirPrecioEnLibras() {
		double libras = this.precio * 0.86;
		System.out.println("Precio en libras: " + libras + "£");
	}
	//Metodo para invertir la fecha de creacion
	public void mostrarFechaInvertida() {
		String fecha = this.fechaCreacion;
		String []recorrerFecha = fecha.split("/");
		String fechaInvertida = recorrerFecha[2] + "/" + recorrerFecha[1] + "/" + recorrerFecha[0];
		System.out.println(fechaInvertida);
		
	}
	//Metodo para mostrar un descuento si el juego es de segunda mano
	public double mostrarDescuentoSegundaMano() {
		double descuento = this.precio;
		if(this.esSegundaMano) {
			descuento = this.precio * 0.7;
		}
		return descuento;
	}
	//Metodo para saber si un juego es apto para jugarlo
	public boolean esAptoParaJugar() {
		return puntuacion >= 5;
		//otra forma: if(this.puntuacion >= 5) {
		// syso("El videojuego es apto");
		//}else{
		// syso("El videojuego  no es apto");
		//}
				
	}
	//Metodo para mostrar los numeros naturales que hay entre su nota y 10
	public void mostrarNumerosNaturales() {
		for(int i = puntuacion; i <= 10; i++) {
			System.out.println(i);
		}
	}
	//Metodo para saber si un videojuego es mas caro que otro
	public boolean esMasCaroQue(_videojuego otroVideojuego) {
		 return this.precio > otroVideojuego.precio;
		}
       
       
}	

