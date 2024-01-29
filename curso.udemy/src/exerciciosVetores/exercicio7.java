package exerciciosVetores;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int mediaPares, soma, pares;
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] x = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			x[i] = sc.nextInt();
		}
		
		soma = 0;
		for(int i=0; i<n; i++) {
			if(x[i] % 2 == 0) {
				soma = soma + x[i];
			
			}
			
		}
		
		pares = 0;
		for(int i=0; i<n; i++) {
			if(x[i] % 2 == 0) {
				pares++;
			}
		}
		
		if(pares >= 1) {
			mediaPares = soma/pares;
			System.out.println("MEDIA DOS PARES = " + mediaPares);
			
		}else {
			System.out.println("NENHUM NUMERO PAR");
		}
	
		
		
		sc.close();
	}

}
