package actividad_13;

import java.util.Scanner;

public class mainUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Usuario[] listaUsuarios = new Usuario[3];
		System.out.println("Introduzca el numero de valoraciones que va a dar: ");
		int arrayTamanio = sc.nextInt();
		listaUsuarios[0] = new Usuario("23ft5", "Joselu", new double[arrayTamanio]);
		listaUsuarios[1] = new Usuario("1WDSF", "JUAN", new double[arrayTamanio] );
		listaUsuarios[2] = new Usuario("1112D", "Antonio", new double[arrayTamanio] );
		
		for(Usuario u : listaUsuarios) {
			pedirValoraciones(sc,u);
		}
		for(int i = 0; i <listaUsuarios.length; i++) {
			System.out.println("---------------------------------------------------------------------------------------------------------------");
			System.out.println("Usuario " + (i+1));
			System.out.println(listaUsuarios[i]);
			System.out.println("La media de las valoraciones es: " + listaUsuarios[i].devolverValoracionMedia());
			listaUsuarios[i].mostrarValoraciones();
			// Devolver puntuaciones más altas
			System.out.println("La cantidad de notas más altas es: " + listaUsuarios[i].devolverPuntuacionesMasAltas(5));
			// Devolver mayor y menor media
			System.out.println("La valoracion supera la media de valoraciones ? = " + listaUsuarios[i].devolverMayorOMenorMediaValoracion(7));
			System.out.println("---------------------------------------------------------------------------------------------------------------");
		}
		
		
	}
	
	public static void pedirValoraciones(Scanner sc, Usuario usuario) {
		System.out.println("Valoracion usuario");
		for(int j = 0; j < usuario.valoraciones.length; j++) {
			double valoracion = 0;
			do {
				System.out.println("Introduce la valoracion del usuario con numero " + (j+1));
				valoracion = sc.nextDouble();
				
			}while((valoracion > 10) || (valoracion <0 ));
			usuario.valoraciones[j] = valoracion;
		}
		
	}
}
