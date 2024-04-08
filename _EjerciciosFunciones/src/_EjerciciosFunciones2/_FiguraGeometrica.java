package _EjerciciosFunciones2;

public class _FiguraGeometrica {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a la aplicación FIGURA GEOMÉTRICA");
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		System.out.println("------ÁREA RECTÁNGULO-----");
		area(4,3);
		System.out.println("--------------------------");
		System.out.println("------ÁREA CIRCULO-----");
		area(3.14,4.3);
		System.out.println("--------------------------");
		System.out.println("------ÁREA TRIÁNGULO-----");
		area(3.2,5);
		System.out.println("--------------------------");
	}
	
	///AREA RECTANGULO
	public static int area(int base,int altura) {
		int rectangulo = base * altura;
		System.out.println("El área del rectángulo es: " + rectangulo);
		return rectangulo;
	}
	///AREA CIRCULO
	public static double area(double pi, double radio)	{
		double circulo = pi * (radio * radio);
		System.out.println("El área del rectángulo es: " + circulo);
		return circulo;
	}
	///AREA TRIANGULO
	public static double area(double base, int altura) {
		double triangulo = (base * altura) / 2;
		System.out.println("El área del triangulo es: " + triangulo);
		return triangulo;
	}
}
