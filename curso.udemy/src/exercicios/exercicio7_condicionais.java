package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio7_condicionais {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double coordenada1 = sc.nextDouble();
		double coordenada2 = sc.nextDouble();
		
		if (coordenada1 > 0.0 && coordenada2 > 0.0) {
			System.out.println("Q1");
			
		}else if (coordenada1 < 0.0 && coordenada2 > 0.0 ) {
			System.out.println("Q2");
			
		}else if (coordenada1 < 0.0 && coordenada2 < 0.0) {
			System.out.println("Q3");
			
		}else if (coordenada1 > 0.0 && coordenada2 < 0.0) {
			System.out.println("Q4");
			
		}else if ( coordenada2 == 0.0) {
				System.out.println("Eixo X");
		
		}else if (coordenada1 == 0.0) {
			System.out.println("Eixo Y");
		
		}else 
				System.out.println("Origem");
		
		
		
		
		sc.close();
	}

}
