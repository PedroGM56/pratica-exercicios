package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		char[] genero = new char[n];
		double[] altura = new double[n];
		double maiorAltura, menorAltura, mediaMulheres;
		int quantidadeHomens = 0;
		int quantidadeMulheres = 0;

		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			genero[i] = sc.next().charAt(0);

		}

		menorAltura = altura[0];
		maiorAltura = altura[0];
		for (int i = 0; i < n; i++) {
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];

			}
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];

			}
		}

		double soma = 0;
		for (int i = 0; i < n; i++) {
			if (genero[i] == 'M') {
				quantidadeHomens++;
				
			}else {
				quantidadeMulheres++;
				soma = soma + altura[i];
			}
		}

		mediaMulheres = soma / quantidadeMulheres;

		System.out.printf("Menor altura: %.2f\n", menorAltura);
		System.out.printf("Maior altura: %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres: %.2f\n", mediaMulheres);
		System.out.println("Numero de homens: " + quantidadeHomens);

		sc.close();

	}

}
