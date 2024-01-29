package exerciciosVetores;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i=0; i<n; i++) {
			x[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int i=0; i<n; i++) {
			y[i] = sc.nextInt();
		}
		
		int[] c = new int[n];
		
		for(int i=0; i<n; i++) {
			c[i] = x[i] + y[i];
		
		}
		
		System.out.println("Vetor resultante:");
		
		 for (int i=0; i<n; i++) {
		    	System.out.printf("%d\n", c[i]);
		    }
		
		
		sc.close();
	}

}
