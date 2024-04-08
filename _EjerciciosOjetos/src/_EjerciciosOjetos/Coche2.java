package _EjerciciosOjetos;

public class Coche2 {
	int id;
	String marca;
	String modelo;
	double precioBase;
	String fechaMatriculacion;
	double kilometros;
	
	//Constructor sin parametros
	
	public Coche2() {
		super();
		this.marca= "";
		this.modelo = "";
			
	}
	//Constructor con todos los parámetros
	public Coche2(int id, String marca, String modelo,double precioBase, String fechaMatriculacion,double kilometros) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.precioBase = precioBase;
		this.fechaMatriculacion = fechaMatriculacion;
		this.kilometros = kilometros;
	}
	//Metodo mostrar datos por pantalla
	public void mostrarDatos() {
		System.out.println("ID: " + id);
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Precio base : " + precioBase + "€");
		System.out.println("Fecha de matriculación: " + fechaMatriculacion);
		System.out.println("Numero de kilómetros: " + kilometros);
	}
	//Metodo mostras el precio base
	public void precioBase() {
		System.out.println("El precio base es : " + this.precioBase);
	}
	//Metodo año de matriculación
	public void soloAño() {
		String año = this.fechaMatriculacion;
		String []recorrerFecha = año.split("/");
		String mostrarSoloAño = recorrerFecha[2];
		System.out.println(mostrarSoloAño);
	}
	//Metodo para saber si el año de matriculacion es bisiesto
	public void añoBisiesto() {
		
		
	}
	//Metodo precio en funcion de los kilometros
	public void precioKilometros() {
		if(kilometros < 10000) {
			 System.out.println(precioBase);
		}
		else if(kilometros > 10000 && kilometros < 50000) {
			System.out.println(precioBase * 0.8);
		}
		else if(kilometros >= 50000){
			System.out.println(precioBase * 0.5);
		}
	}	
	//Metodo para saber si los kilotros son primos
	public static boolean esPrimo(double kilometros) {
		if (kilometros <= 1) {
	       return false;
	    }
	        
	        // Verificar si el número es divisible por algún número desde 2 hasta la raíz cuadrada del número
	        for (int i = 2; i < kilometros; i++) {
	            if (kilometros % i == 0) {
	            	System.out.println("No es primo");
	                return false;// Si es divisible, no es primo
	            }
	        }
	        System.out.println("Es primo");
	        return true; // Si no fue divisible por ningún número, es primo
	    }
	
	//Metodo cuantos kilometros faltan
	public void cuantosKilometrosFaltan() {
		if(kilometros < 200000) {
			System.out.println("Faltan " + (200000 - kilometros) + " kilómetros para llegar a 200000.");
		}
	}
	//Metodo para saber los caracteres de la marca 
	public int numeroCaractersMarca() {
		return marca.length();
		}
		
    // Método para obtener los caracteres del modelo
    public int numeroCaracteresModelo() {
        return modelo.length();
    	}
    //Metodo comparar kilometros
    public double compararKilometros(Coche2 otroCoche) {
    	double diferencia = (this.kilometros - otroCoche.kilometros);
    	return diferencia;
    	
    }
  //Metodo para saber si un COCHE es mas caro que otro
  	public boolean esMasCaroQue(Coche2 otroCoche) {
  		 return this.precioBase > otroCoche.precioBase;
  		}
	}

