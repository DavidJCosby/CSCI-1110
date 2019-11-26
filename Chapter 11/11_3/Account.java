f/*
Author: David Cosby
Date: 11/8/2019

Creates an "Account" class that uses private, public, static data fields and modifiers.
*/

import java.util.Date;

public class Account {
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
		return balance * getMonthlyInterestRate();
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public String toString() {
		String output = "Account";
		output += "\nDate created: " + dateCreated.toString();
		output += "\nID: " + id;
		output += "\nBalance: $" + balance;
		output += "\nAnnual Interest Rate: " + annualInterestRate; 
		return output;
	}
}
