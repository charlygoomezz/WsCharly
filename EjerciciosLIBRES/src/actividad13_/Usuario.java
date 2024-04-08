package actividad13_;

import java.util.ArrayList;

public class Usuario {
	private String id;
	private String nombre;
	private ArrayList<Integer> listaPuntuaciones;
	
	public Usuario() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Integer> getListaPuntuaciones(){
		return listaPuntuaciones;
	}
	public void setListaPuntuaciones(ArrayList<Integer> listaPuntuaciones) {
		this.listaPuntuaciones = listaPuntuaciones;
	}
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", listaPuntuaciones=" + listaPuntuaciones + "]";
	}
	
	public double valoracionMedia() {
		double suma = 0;
		double mediaTotal = 0;
		for(Integer m : listaPuntuaciones) {
			suma += m;
			mediaTotal = suma / listaPuntuaciones.size();
		}
		return mediaTotal;
	}
	public void mostraValoraciones() {
		for(Integer m : listaPuntuaciones) {
			System.out.println("Las valoraciones son: " + m);
		}
	}
	public int cuantasValoracionesSuperan(Double valoracion) {
		int notasMayores = 0;
		for(Integer v : listaPuntuaciones ) {
			if(valoracion > v) {
				notasMayores ++;
			}
		}
		return notasMayores;
	}
	public boolean superaValoracionMedia(Double valoracion) {
		double media = this.valoracionMedia();
		if(valoracion > media) {
			return true;			
		}else {
			return false;
		}
	}

}
