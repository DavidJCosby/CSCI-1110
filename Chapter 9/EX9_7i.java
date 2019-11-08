/*
Author: David Cosby
Date: 11/8/2019

Creates an "Account" class that uses private, public, static data fields and modifiers. Tests the class by constructing an Account and using various methods on it.
*/
import java.util.Date;

class Account {
	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;
	private Date dateCreated;
	
	public Account() {
		dateCreated = new Date();
	}
	
	public Account(int requestedId, double requestedBalance) {
		dateCreated = new Date();
		id = requestedId;
		balance = requestedBalance;
	}
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public void setId(int newId) {
		id = newId;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public static void setAnnualInterestRate(double newInterestRate){
		annualInterestRate = newInterestRate;
	}
	
	public static double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest() {
		return balance * Account.getMonthlyInterestRate();
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
}

class EX9_7i {
	public static void main(String[] args) {
		Account.setAnnualInterestRate(0.045);
		Account acc = new Account(1122, 20000);
		acc.withdraw(2500);
		acc.deposit(3000);
		System.out.println("Account balance: $" + acc.getBalance());
		System.out.println("Account monthly interest: $" + acc.getMonthlyInterest());
		System.out.println("Account Date created: " + acc.getDateCreated().toString());
		
	}
}