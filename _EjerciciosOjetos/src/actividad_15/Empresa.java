package actividad_15;

public class Empresa {
	String nombre;
	String nif;
	String[] listaTrabajadores;
	
	
	 // Constructor sin parámetros
	public Empresa() {
		super();
	}
	
	// Constructor con parámetros
	public Empresa(String nombre, String nif, String[] listaTrabajadores) {
		super();
		this.nombre = nombre;
		this.nif = nif;
		this.listaTrabajadores = listaTrabajadores;
	}

	//Método para saber si existe un trabajador en la empresa, pasándole un DNI por parámetro.
	public boolean existeTrabajador(String dni) {
        for (String trabajador : listaTrabajadores) {
            if (trabajador.equals(dni)) {
                return true;
            }
        }
        return false;
    }

	//Método para devolver el numero de trabajadores que tienen.
	public int numeroTrabajadores() {
        return listaTrabajadores.length;
    }
	//Método para devolver el salario total que se gasta en sus trabajadores.
	public double devolverSalarioTotal() {
		double salarioTotal = 0;
		for(String trabajador : listaTrabajadores) {
			salarioTotal += trabajador.salario;
		}
		return salarioTotal;
	}
	//Método para devolver cuantos trabajadores ganan más de 3000€
	//Método para devolver cuantos trabajadores ganan menos del SMI.
	//Método para devolver cuantos trabajadores ganan más que una cantidad pasada por parámetro.
	//Método para devolver si todos los trabajadores tienen un DNI valido.
	//Método para devolver si una empresa pasada por parámetro es exactamente igual a la  misma. Un empresa es exactamente igual si tiene el mismo nombre y el mismo NIF
	
	
	

}
