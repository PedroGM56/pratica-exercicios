package curso.udemy;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner n = new Scanner(System.in);
		
		int numero_funcionario = n.nextInt();
		int horas = n.nextInt();
		double valor_hora = n.nextDouble();
		double salario = horas * valor_hora;
		
		System.out.println("NUMBER: " + numero_funcionario);
		System.out.printf("SALARY: U$ %.2f", salario);
		
		
		
		n.close();

	}

}
