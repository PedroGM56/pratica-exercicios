package exerciciosVetores;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] x = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite um numero: ");
			x[i] = sc.nextInt();
		}
		
		int maiorValor = x[0];
		int posMaior = 0;
		
		for(int i=1; i<n; i++) {
			if(x[i] > maiorValor) {
				maiorValor = x[i];
				posMaior = i;
			}
		}
		
		
		System.out.print("MAIOR VALOR: " + maiorValor);
		System.out.print("\nPOSICAO DO MAIOR VALOR: " + posMaior);
		
		sc.close();
	}

}
