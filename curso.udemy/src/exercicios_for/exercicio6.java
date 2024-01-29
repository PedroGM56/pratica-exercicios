package exercicios_for;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i=1; i<=x; i++) {
			
			int div = x/i;
			
			if (div * i == x) {
				System.out.println(i);
			}
			
			
		}
			

		
		
		
		
		
		
		sc.close();

	}

}
