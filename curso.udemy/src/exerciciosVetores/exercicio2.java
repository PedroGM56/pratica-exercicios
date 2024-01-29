package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double avgHeight, percentage;
		int menosDezesseis;
		
		
		String[] names = new String[n];
		int[] ages = new int[n];
		double[] heights = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa\n", i+1);
			System.out.println("Nome: ");
			names[i] = sc.next();
			System.out.println("Idade: ");
			ages[i] = sc.nextInt();
			System.out.println("Altura: ");
			heights[i] = sc.nextDouble();
			
		}
		
		double soma = 0;
		avgHeight = 0;
		for(int i=0; i<n; i++) {
			soma = heights[i] + soma;
			avgHeight = soma/n;
	
		}
		
		menosDezesseis = 0;
		for(int i=0; i<n; i++) {
			if(ages[i] < 16) {
				menosDezesseis += 1;
			}
		}
		
		percentage = menosDezesseis * 100 / n;
		
		System.out.printf("Altura media: %.2f\n", avgHeight);
		System.out.printf("Pessoas com menos de dezesseis anos: %.1f%%\n", percentage);
		
		 for(int i=0; i<n; i++) {
		        if (ages[i] < 16) {
		        	System.out.printf("%s\n", names[i]);
		        }
		    }
				
				
				
				
				
		sc.close();
	}

}
