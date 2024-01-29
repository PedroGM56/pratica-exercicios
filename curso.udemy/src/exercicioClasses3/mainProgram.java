package exercicioClasses3;

import java.util.Locale;
import java.util.Scanner;

public class mainProgram {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		student st = new student();
		
		st.name = sc.nextLine();
		st.nota1 = sc.nextDouble();
		st.nota2 = sc.nextDouble();
		st.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", st.notaFinal());
		
		if(st.notaFinal() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING: %.2f POINTS%n", st.missing());
		}else {
			System.out.println("PASS");
		}
		
		
		
		sc.close();
	}

}
