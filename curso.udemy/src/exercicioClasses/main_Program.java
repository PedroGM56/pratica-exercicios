package exercicioClasses;

import java.util.Locale;
import java.util.Scanner;

public class main_Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		retangle rect = new retangle();
		
		
		System.out.println("Enter rectangle width and height:");
		
		 rect.width = sc.nextDouble();
		 rect.height = sc.nextDouble();
		 
		 System.out.printf("AREA = %.2f%n", rect.area());
		 System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		 System.out.printf("DIAGONAL = %.2f", rect.diagonal());
		 
		
		
		
		
		
		
		
		
		sc.close();

	}

}
