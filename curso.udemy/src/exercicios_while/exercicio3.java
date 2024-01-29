package exercicios_while;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int clientesAlcool = 0;
		int clientesGasolina = 0;
		int clientesDiesel = 0;
		int combustivel = sc.nextInt();
		
		while (combustivel != 4) {
			
			if (combustivel == 1) {
				clientesAlcool += 1;
						
			}else if (combustivel == 2) {
				clientesGasolina += 1;
				
			}else if (combustivel == 3) {
				clientesDiesel += 1;
				
			}			
			
			combustivel = sc.nextInt();
			
		}	
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + clientesAlcool);
		System.out.println("Gasolina: " + clientesGasolina);
		System.out.println("Diesel " + clientesDiesel);
		
		
		sc.close();
	}

}
