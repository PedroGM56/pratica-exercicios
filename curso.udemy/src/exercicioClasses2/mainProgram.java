package exercicioClasses2;

import java.util.Locale;
import java.util.Scanner;

public class mainProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		employee empl = new employee();
		
		empl.name = sc.nextLine();
		empl.grossSalary = sc.nextDouble();
		empl.tax = sc.nextDouble();
		
		System.out.println("Name: " + empl.name);
		System.out.printf("Gross Salary: %.2f%n ", empl.grossSalary);
		System.out.printf("Tax: %.2f%n", empl.tax);
		
		System.out.println("Employee: " + empl);
		System.out.println();
		System.out.printf("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		empl.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + empl);
		
		
		
		
		
		
		
		
		sc.close();
	}

}
