/*
Author: David Cosby
Date: 11/20/2019

Constructs Account, SavingsAccount, and CheckingAccount classes, invokes their toString() methods.
*/


class EX11_3i {
	public static void main(String[] args) {
		Account account1 = new Account(69, 420);
		SavingsAccount account2 = new SavingsAccount(70, 123);
		CheckingAccount account3 = new CheckingAccount(71, 9200, 500);
				
		System.out.println(account1.toString());
		System.out.print("\n");
		System.out.println(account2.toString());		
		System.out.print("\n");
		System.out.println(account3.toString());
	}
}