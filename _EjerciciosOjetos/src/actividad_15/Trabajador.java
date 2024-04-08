package actividad_15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import actividad_14.Equipo;

public class Trabajador {
	String nombre;
	String dni;
	double salario;
	
	
	 // Constructor sin parámetros.
	public Trabajador() {
		super();
	}
	// Constructor con parámetros
	public Trabajador(String nombre, String dni, double salario) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.salario = salario;
	}
	
	//Metodo mostrar todos sus datos por pantalla (mediante el método toString())
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni + ", salario=" + salario + "]";
	}
	//Método para devolver si un DNI es valido.
	 public static boolean validarDNIPorExpresionRegular(String dni) {
	        // Expresión regular para un DNI español
	        String regex = "\\d{8}[A-Za-z]";
	        
	        // Compilar la expresión regular en un objeto Pattern
	        Pattern pattern = Pattern.compile(regex);
	        
	        // Crear un objeto Matcher para el DNI proporcionado
	        Matcher matcher = pattern.matcher(dni);
	        
	        // Devolver true si el DNI coincide con la expresión regular, false en caso contrario
	        return matcher.matches();
	        
	    }
	//Método para devolver si un trabajador gana más que otro trabajador pasado por parámetro.
	 public boolean ganaMasUnTrabajadorQueOtro(Trabajador otroTrabajador) {
		 return this.salario > otroTrabajador.salario;
	 }
			 
	//Método para devolver si un trabajador es igual a otro. 
	 public boolean sonTrabajadoresIguales (Trabajador otroTrabajador) {
			if (this.dni == otroTrabajador.dni){
				return true;
			}
			return false;
		}

		

}
