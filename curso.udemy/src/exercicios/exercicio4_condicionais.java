package exercicios;

import java.util.Scanner;

public class exercicio4_condicionais {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			int hora_inicial, hora_final, duracao;
			hora_inicial = sc.nextInt();
			hora_final = sc.nextInt();
			
			
			if (hora_inicial < hora_final){
					duracao = hora_final - hora_inicial;
			}
			else {
					duracao = 24 - hora_inicial + hora_final;
			}
			
				System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
	sc.close();
	}

}
