package actividad_13;

import java.util.Arrays;

public class Usuario {
	public String id;
	public String nombre;
	public double[] valoraciones;

	public Usuario() {
		super();
	}

	public Usuario(String id, String nombre, double[] valoraciones) {
		this.id = id;
		this.nombre = nombre;
		this.valoraciones = valoraciones;

	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", valoraciones=" + Arrays.toString(valoraciones) + "]";
	}
	
	public double devolverValoracionMedia() {
		double media = 0;
		double suma = 0 ;
		for(double m : this.valoraciones) {
			suma += m;
		}
		media = suma/valoraciones.length;
		return media;
	}
	public void mostrarValoraciones() {
		System.out.println("Lista de Valoraciones: ");
		int i = 0;
		for(double v : this.valoraciones) {
			System.out.println("Valoracion " + i + " : " + v);
			i++;
		}
	}
	public int devolverPuntuacionesMasAltas(double nota) {
		int notasMayores = 0;
		for(double d : valoraciones) {
			if(d > nota) {
				notasMayores ++;
			}
		}
		return notasMayores;
		
		
	}
	public boolean devolverMayorOMenorMediaValoracion(double nota) {
		double media = this.devolverValoracionMedia();
		boolean flag = false;
		if(nota > media) {
			return true;
		}
		return flag;
	}
	

}
