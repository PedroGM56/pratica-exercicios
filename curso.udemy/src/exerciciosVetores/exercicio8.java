package exerciciosVetores;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		String[] name = new String[n];	
		int[] age = new int[n];
	
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa\n", i+1);
			System.out.println("Nome: ");
			name[i] = sc.next();
			System.out.println("Idade: ");
			age[i] = sc.nextInt();
		}
		
		int older = age[0];
		int posicaoMaior = 0;
		for(int i=1; i<n; i++) {
			if(age[i] > older) {
				older = age[i];
				posicaoMaior = i;
		
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + name[posicaoMaior]);
				
		sc.close();
	}

}
