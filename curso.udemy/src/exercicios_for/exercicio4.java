package exercicios_for;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		
		
		for (int i=0; i<N; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			
			double divisao = x/y;
			
			if (y==0) {
				System.out.println("Divisao impossivel");
			
			}else {
			
			System.out.printf("%.1f%n", divisao);
			
		}
	
		}	
		
		
		
		
		
		
		
		
		sc.close();

	}

}
