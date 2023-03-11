package oops;

public class Employee {
	
	public String Name;
	public int EmpId;
	private static int Salary=50000;
	
	
	public Employee() {
		
		System.out.println("Inside default cons");
	}
	
	public Employee(String var1, int var2) {
		
		System.out.println("Inside param cons");
		
		Name = var1;
		EmpId = var2;
	}
	
	public void DisplayName() {
		
		System.out.println("Name of the Employee is " + Name);
}
	public static void DisplaySalary() {
		System.out.println("Salary of all Employees " + Salary);
		
	}
	
}
