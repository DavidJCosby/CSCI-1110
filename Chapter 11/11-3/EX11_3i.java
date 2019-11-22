/*
Author: David Cosby
Date: 11/20/2019

Constructs Account, SavingsAccount, and CheckingAccount classes, invokes their toString() methods.
*/


class EX11_3i {
	public static void main(String[] args) {
		Account.setAnnualInterestRate(0.026);

		Account account1 = new Account(69, 420);
		SavingsAccount account2 = new SavingsAccount(70, 123);
		CheckingAccount account3 = new CheckingAccount(71, 0, 500);

		System.out.println(account1.toString());
		System.out.print("\n");
		System.out.println(account2.toString());		
		System.out.print("\n");
		System.out.println(account3.toString());
		
		System.out.println("\n\nAttempting to withdraw $500 from each account");
		System.out.print("Account #69: " + account1.getBalance());
		account1.withdraw(500);
		System.out.println(" -> " + account1.getBalance());
		
		System.out.print("Account #70: " + account2.getBalance());
		account2.withdraw(500);
		System.out.println(" -> " + account2.getBalance());
		
		System.out.print("Account #71: " + account3.getBalance());
		account3.withdraw(500);
		System.out.println(" -> " + account3.getBalance());


		System.out.println("\nAttempting to withdraw $50 from each account");
		System.out.print("Account #69: " + account1.getBalance());
		account1.withdraw(50);
		System.out.println(" -> " + account1.getBalance());
		
		System.out.print("Account #70: " + account2.getBalance());
		account2.withdraw(50);
		System.out.println(" -> " + account2.getBalance());
		
		System.out.print("Account #71: " + account3.getBalance());
		account3.withdraw(50);
		System.out.println(" -> " + account3.getBalance());
	}
}