package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio8_condicionais {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double impostoRenda;
		double salario = sc.nextDouble();
		
		if (salario <= 2000.00) {
			impostoRenda = 0.0;
			
		}else if (salario <= 3000.00){
			impostoRenda = (salario - 2000.0) * 0.08;
			
		}else if (salario <= 4500.00) {
			impostoRenda = (salario - 3000.0) * 0.18 + 1000 * 0.08;	
			
		}else {
			impostoRenda = (salario - 4500.0) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
		
		}
		
		if (impostoRenda == 0.0) {
			System.out.println("Isento");
			
		}else 
			System.out.printf("R$ %.2f", impostoRenda);
	

		
		
		
		
		
		
		
		sc.close();
	}

}
