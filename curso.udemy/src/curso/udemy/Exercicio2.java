package curso.udemy;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio = sc.nextDouble();
		double area = pi* Math.pow(raio, 2.0);
		
		System.out.printf("A = %.4f", area);
		
		sc.close();

	}

}
