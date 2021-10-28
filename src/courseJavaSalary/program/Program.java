package courseJavaSalary.program;

import java.util.Scanner;

import courseJavaSalary.entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Salary funcionay");
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Enter name of funcionary: ");
		funcionario.nome = sc.nextLine();
		
		System.out.print("Enter gross_salary: ");
		funcionario.gross_salary = sc.nextDouble();
		
		System.out.print("Enter tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.print("Enter Increment salary: ");
		funcionario.increment = sc.nextDouble();
		
		System.out.print(funcionario.toString());
		
		sc.close();

	}

}
