package courseJavaSalary.entities;

public class Funcionario {

	public String nome;
	public Double tax;
	public Double gross_salary;
	public Double increment;

	public double NetSalary() {
		return gross_salary - tax;
	}

	public double IncrementeSalary() {
		return gross_salary + (gross_salary * (increment/100));

	}

	public String toString() {
		return "Employee: " + nome + ", $ " + String.format("%.2f", NetSalary()) + 
				" Upadate data: " + nome + ", $ " + String.format("%.2f", IncrementeSalary());
	}
}
