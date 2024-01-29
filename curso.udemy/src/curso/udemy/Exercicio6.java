package curso.udemy;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		double pi = 3.14159;
			A  = sc.nextDouble();
			B = sc.nextDouble();
			C = sc.nextDouble();
			double area_triangulo = A * C/2;
			double area_circulo = pi * Math.pow(C, 2);
			double area_trapezio = (A + B)/2 * C;
			double area_quadrado = Math.pow(B, 2);
			double area_retangulo = A * B;
			
			System.out.printf("TRIANGULO: %.3f%n", area_triangulo);
			System.out.printf("CIRCULO: %.3f%n", area_circulo);
			System.out.printf("TRAPEZIO: %.3f%n", area_trapezio);
			System.out.printf("QUADRADO: %.3f%n", area_quadrado);
			System.out.printf("RETANGULO: %.3f%n", area_retangulo);
		
		
		
		
		
		sc.close();
	}

}
