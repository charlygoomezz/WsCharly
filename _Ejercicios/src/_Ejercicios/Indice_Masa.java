package _Ejercicios;

public class Indice_Masa {

	public static void main(String[] args) {
		// IMPORTANTE!!!!!!!!!!
		//Para calcular el Indice de Masa Corporal de una persona
		//el usuario debe introducir los valores de peso en 
		//kilogramos y de altura en metros.
		
		double peso;
		peso = 50;
		double altura;
		altura = 1.80;
		double IMC = peso / (altura * altura);
		System.out.println("El IMC es: " + IMC);

	}

}
