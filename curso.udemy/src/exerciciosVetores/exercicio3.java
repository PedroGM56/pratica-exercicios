package exerciciosVetores;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		
		System.out.print("Quantos numeros voce vai ler? ");
		int n = sc.nextInt();
		int[] x = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite um numero: ");
			x[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS PARES: ");
		
		for(int i=0; i<n; i++) {
			if(x[i] %2 == 0) {
				System.out.print(x[i] + "  ");
			}
		}
		
		int numerosPares = 0;
		for(int i=0; i<n; i++) {
			if(x[i] % 2 == 0) {
				numerosPares ++;
			}
		}
				
		System.out.println("\nQUANTIDADE DE PARES = " + numerosPares);
		
		
		
		
		sc.close();
	}

}
