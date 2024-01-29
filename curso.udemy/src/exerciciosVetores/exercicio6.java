package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double mediaVetor;
		double abaixoMedia;
		
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] x = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			x[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for(int i=0; i<n; i++) {
			soma = soma + x[i];
		}
		
		mediaVetor = soma/n;
		System.out.printf("MEDIA DO VETOR = %.3f\n", mediaVetor);
		
		abaixoMedia = x[0];
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		
		for(int i=0; i<n; i++) {
			if(x[i] < mediaVetor) {
				abaixoMedia = x[i];
				System.out.println(abaixoMedia);
			}
		}
		
		
		
		
			
		sc.close();
	}

}
