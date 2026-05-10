//Driver class to test Employee 

package employeeManagement;
import java.util.*;

public class EmployeeManagement {
	
	public static Employee employee;
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter employee Id : ");
		int id=sc.nextInt();
		
		System.out.print("Enter employee name : ");
		String name=sc.next();
		
		System.out.print("Enter employee designation : ");
		String designation=sc.next();
		
		System.out.print("Enter employee salary : ");
		double salary=sc.nextDouble();
		
		employee=new Employee(id, name, designation, salary);
		
		System.out.println("Emplooyee Management System."
				+ "\n1. Increment salary"
				+ "\n2. Inreament salary with bonus"
				+ "\n3. Display employee details"
				+ "\n4. Exit");
		
		while(true){
			int choice;
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice){
				case 1:
					
					System.out.print("\nEnter Increment percentage : ");
					double percentage = sc.nextDouble();
					
					employee.increaseSalary(percentage);
					break;
					
				case 2:
					
					System.out.print("\nEnter the percentage of salary increament : ");
					percentage = sc.nextDouble();
					
					System.out.print("\nEnter the bonus: ");
					double bonus = sc.nextDouble();
					
					employee.increaseSalary(percentage, bonus);
					break;
					
				case 3:
					System.out.print(employee.displayInfo());
					break;
					
				case 4:
					System.out.println("Thank you!");
					return;
					
				default:
					System.out.println("\nInvalid Input. Try again.");
			}
		}
		
	}
}
