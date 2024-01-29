package curso.udemy;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			int codigo1 = sc.nextInt();
			int numero_pecas1 = sc.nextInt();
			double valor_peca1 = sc.nextDouble();
			double valor_total1 = numero_pecas1 * valor_peca1;
			
			int codigo2 = sc.nextInt();
			int numero_pecas2 = sc.nextInt();
			double valor_peca2 = sc.nextDouble();
			double valor_total2 = numero_pecas2 * valor_peca2;
			
			double valor_pagar = valor_total1 + valor_total2;
			
			System.out.printf("VALOR A PAGAR: R$ %.2f", valor_pagar);
			
			sc.close();
			
			
			
	}

}
