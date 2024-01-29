package exercicios_for;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i=1; i<=x; i++) {
			
			int linha = i;
			int quadrado = i * i;
			int cubo = i * i * i;
			
			System.out.printf("%d %d %d%n" ,linha, quadrado, cubo);
			
		}
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
