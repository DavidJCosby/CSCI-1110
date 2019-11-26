/*
Author: David Cosby
Date: 11/8/2019

Tests the Account class by constructing an Account and using various methods on it.
*/



public class EX9_7i {
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