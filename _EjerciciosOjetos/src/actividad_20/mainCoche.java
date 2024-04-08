package actividad_20;

import java.util.ArrayList;
import java.util.Scanner;

public class mainCoche {
	
	private Scanner sc;
	private ArrayList<Coche> listaCoches;
	
	public static void main(String[] args) {
		mainCoche main = new mainCoche();
		main.arrancarPrograma();

	}
	
	public void arrancarPrograma() {
		sc = new Scanner(System.in);
		listaCoches = new ArrayList<>();
		String opcion = null;
		
		do {
			opcion = mostrarMenu();
			switch (opcion) {
			case "1": 
				crearCoche();
				break;
			case "2": 
				mostrarCoches();
				break;
			case "3":
				mostrarContadorID();
				break;
			case "4":
				resetearContadorID();
				break;
			case "5":
				System.out.println("Saliste del programa");
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		}while(!opcion.equals("5"));
	}
	
	public String mostrarMenu() {
		System.out.println();
		System.out.println("Menu");
		System.out.println("1- Crear Coche");
		System.out.println("2- Mostrar Coches");
		System.out.println("3- Mostrar contador ID");
		System.out.println("4- Resetear contador ID");
		System.out.println("5- Salir del programa");
		System.out.print("Elija una opción:");
		String opcion = sc.nextLine();
		return opcion;
	}
	
	public Coche crearCoche() {
		System.out.println("Introduzca la matricula");
		String matricula = sc.nextLine();
		System.out.println("Introduzca la marca");
		String marca = sc.nextLine();
		
		Coche coche = new Coche();
		coche.setMatricula(matricula);
		coche.setMarca(marca);
		
		listaCoches.add(coche);
			
		return null;
	}
	
	public void mostrarCoches() {
		for (Coche c : listaCoches) {
			System.out.println(c);
			
		}
	}
	
	public void mostrarContadorID() {
		System.out.println(Coche.getContadorID());
		
	}
	
	public void resetearContadorID() {
		System.out.println("Contador reseteado a 0");
		Coche.getContadorID();
	}
}
