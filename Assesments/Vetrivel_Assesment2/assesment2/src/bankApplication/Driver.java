package bankApplication;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Account Id : ");
		int accountId=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Customer Id : ");
		int customerId=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Customer Name : ");
		String customerName=sc.nextLine();
		
		System.out.print("Enter Customer Gender (F/M) : ");
		char gender=sc.next().toLowerCase().charAt(0);
		
		while(gender!='m'&& gender!='f') {
			System.out.print("Enter valid gender(F/M) : ");
			gender=sc.next().toLowerCase().charAt(0);
		}
		
		System.out.print("Enter Account Balance : ");
		double balance=sc.nextDouble();
		sc.nextLine();
		
		Customer customer=new Customer(customerName,customerId,gender);
		Account account=new Account(accountId,customer,balance);
		
		int choice;
		do {
			System.out.println("\nPLEASE SELECT ONE OPTION FROM BELOW");
			System.out.println("1.WITHDRAW\n"
					+"2. DEPOSIT\n"
					+"3. CHECK BALANCE\n"
					+"4. EXIT ");
			
			choice=sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.print("Enter amount to withdraw : ");
					double amount=sc.nextDouble();
					
					account.withdraw(amount);
					break;
					
				case 2:
					
					System.out.print("Enter amount to withdraw : ");
					amount=sc.nextDouble();
					
					//to avoid reduction while giving negative amount
					while(amount<0) {
						System.out.print("Amount couldnt be negative\nTry again : ");
						amount=sc.nextDouble();
					}
					
					account.deposit(amount);
					break;
					
				case 3:
					System.out.print("Current Balance : "+account.getBalance());
					break;
				
				case 4:
					System.out.print("THANK YOU FOR BANKING WITH US!!");
					break;
					
				default:
					System.out.print("Invalid Input.");
			}
		}while(choice!=4);
	}
}
