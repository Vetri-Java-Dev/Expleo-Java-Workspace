package bankApplication;
import java.util.Scanner;

public class Account {
	private int id;
	private Customer customer;
	private double balance;
	
	public Account(int id, Customer customer, double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}
	
	public Account(int id, Customer customer) {
		this.id = id;
		this.customer = customer;
	}
	
	public int getId() {
		return id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public double getBalance() {
		return balance;
	}
	
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public String getCustomerName() {
		return customer.getName();
	}
	
	public void deposit(double amount) {
		this.balance=balance+amount;
		System.out.print("Amount Succesfully deposited.");
	}
	
	public void withdraw(double amount) {
		if(amount<=balance) {
			this.balance=balance-amount;
			System.out.print("Amount Succesdully withdrawn.");
		}
		else {
			System.out.print("Amount withdrawn exceeds current balance.");
		}
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", customer=" + customer + ", balance=" + balance + "]";
	}
	
	
	
}
