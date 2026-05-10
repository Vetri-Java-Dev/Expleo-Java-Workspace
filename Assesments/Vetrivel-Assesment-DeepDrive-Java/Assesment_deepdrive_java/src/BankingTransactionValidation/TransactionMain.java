package BankingTransactionValidation;

import java.util.Scanner;

public class TransactionMain {
    public static void processTransaction(String accountId, double balance,
                                          double amount, double limit) {

        try {
        	TransactionValidator.validateTransaction(accountId, balance, amount, limit);
        } 
        
        catch (InvalidAccountException e){
            System.out.println("InvalidAccountException: "+e.getMessage()+" [Code: "+e.getErrorCode()+"]");
        } 
        
        catch(InsufficientFundsException e) {
            System.out.println("InsufficientFundsException: " + e.getMessage()+" [Code: "+e.getErrorCode()+"]");
        } 
        catch(TransactionLimitException e) {
            System.out.println("TransactionLimitException: " + e.getMessage()+" [Code: "+e.getErrorCode()+ "]");
        } 
        
        catch(BankTransactionException e) {}
        
    }
    
    public static void main(String[] args) {
    		Scanner sc=new Scanner(System.in);
    		
    		
    		//accountId="", balance=1000, amount=500,
    		//limit=2000

    		//accountId="ACC001", balance=200, amount=500,
    		//limit=2000

    		//accountId="ACC002", balance=5000, amount=3000,
    		//limit=2000
    		
    		
    		System.out.print("Enter Account id : ");
    		String accountId=sc.nextLine();
    		
    		System.out.print("Enter Balance : ");
    		double balance=sc.nextDouble();
    		
    		System.out.print("Enter Amount : ");
    		double amount=sc.nextDouble();
    		
    		System.out.print("Enter Limit : ");
    		double limit=sc.nextDouble();
    		
    		
    		processTransaction(accountId,balance,amount,limit);

    		
    }
}