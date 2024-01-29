package exerciciosVetores;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double soma, media;
		
		
		for(int i=0; i<vect.length && i<=10; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
			soma = 0;
		for(int i=0; i<n; i++) {
			soma = soma + vect[i];
		}
		
		media = soma/n;
		
			System.out.print("VALORES: ");
			
		for(int i=0; i<n; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		
		System.out.printf("\nSOMA = %.2f\n ", soma);
		System.out.printf("MEDIA = %.2f\n", media);
		
		
		
	
	
		
		
		
		
		
		
		
		sc.close();
	}

}
