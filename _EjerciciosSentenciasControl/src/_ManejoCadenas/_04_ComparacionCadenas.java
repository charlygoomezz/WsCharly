package _ManejoCadenas;

import java.util.Scanner;

public class _04_ComparacionCadenas {
	//Escribe un programa que pida al usuario su nombre de usuario y su password. 
	//El programa mostrará "bienvenido a nuestro programa" si el usuario es igual 
	//a "Capi" y el password es igual a "odioAironMan69", en caso contrario el 
	//programa mostrará "Usuario o password incorrecto". En el caso del usuario, 
	//puede ser igual sin tener en cuenta mayúsculas o minúsculas, pero en el caso 
	//del password tiene que ser exactamente igual. Además, se debe de eliminar todos 
	//los espacios que haya a derecha y a izquierda tanto para el usuario como para el password.

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación COMPARACIÓN DE CADENAS");
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduca el nombre de usuario: ");
		String usuario = sc.nextLine().trim();
		System.out.println("Introduca la contraseña: ");
		String password = sc.nextLine().trim();
		
		String usuarioCorrecto = "Capi";
		String passwordCorrecto = "odioAironMan69";
		
		
		
		 if (usuario.equalsIgnoreCase(usuarioCorrecto) && password.equals(passwordCorrecto)) {
	            System.out.println("Bienvenido a nuestro programa");
	            
	        } else {
	            
	            System.out.println("Usuario o password incorrectos.");
	            return;
	        }

	}

}
