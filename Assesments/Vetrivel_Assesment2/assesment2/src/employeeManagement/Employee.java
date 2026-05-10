package employeeManagement;

public class Employee {
	
	private int empId;
	private String name;
	private String designation;
	private double salary;
	
	public Employee(int empId, String name, String designation, double salary) {
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	public String displayInfo() {
		return "Employee Id = " + empId + "\n Employee name = " + name + "\nDesignation = " + designation + "\nSalary=" + salary;
	}
	
	public void increaseSalary(double percentage){
		if(percentage<0){
			System.out.println("Invalid percentage.");
			return;
		}
		
		salary+=salary*percentage/100;
		System.out.println("Updated salary : "+salary);
	}
	
	public void increaseSalary(double percentage, double bonus){
		if(percentage<0){
			System.out.println("Invalid percentage.");
			return;
		}
		
		if(bonus<0){
			System.out.println("Bonus invalid.");
			return;
		}
		
		salary+=salary*percentage/100+bonus;
		System.out.println("Updated salary : "+salary);
	}
	
}