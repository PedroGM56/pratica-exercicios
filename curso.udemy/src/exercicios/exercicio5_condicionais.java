package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5_condicionais {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double valorTotal;
		
		if (codigo == 1) {
			valorTotal =  quantidade * 4.00;
			
		}else if (codigo == 2) {
			valorTotal = quantidade * 4.50;
			
		}else if (codigo == 3) {
			valorTotal = quantidade * 5.00;
			
		}else if (codigo == 4) {
			valorTotal = quantidade * 2.00;
			
		}else {
			valorTotal = quantidade * 1.50;
			
		} 
				
		
		
		System.out.printf("Total: R$ " + valorTotal);
		
		
				
			
		
			
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		sc.close();
	}

}
