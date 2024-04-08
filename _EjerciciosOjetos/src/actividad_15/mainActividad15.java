package actividad_15;

public class mainActividad15 {

	public static void main(String[] args) {
		
	    Trabajador trabajador1 = new Trabajador("Juan","40987876X", 2000);
	    Trabajador trabajador2 = new Trabajador("María","78908765T", 2500);
	       
	    //Gana mas un trabajdor que otro	
	    if (trabajador1.ganaMasUnTrabajadorQueOtro(trabajador2)) {
	            
	    	System.out.println(trabajador1.nombre + " gana más que " + trabajador2.nombre);
	        
	    } else {
	            
	    	System.out.println(trabajador2.nombre + " gana más que " + trabajador1.nombre);
	        
	    }
	    

	}
}
