/*
Author: David Cosby
Date: 11/14/2019

Uses the Account class to mimic an ATM.
*/


import java.util.Scanner;

class EX10_7i {
	
	public static Account[] createAccounts() {
		Account[] accounts = new Account[10];
		for (int i = 0; i < 10; i++) {
			accounts[i] = new Account(i, 100);
		}
		return accounts;
	}
	
	public static void main(String[] args) {
		Account[] accounts = createAccounts();
		Scanner input = new Scanner(System.in);
		
		boolean terminate = false;
		while (!terminate) {
			System.out.print("\nEnter an id: ");
			int id = input.nextInt();

			if (id >= 0 && id < 10) {
				Account selectedAccount = accounts[id];
				boolean exitMenu = false;
				while (!exitMenu) {
					System.out.println("Main menu");
					System.out.println("1: check balance");
					System.out.println("2: withdraw");
					System.out.println("3: deposit");
					System.out.println("4: exit\n");
					System.out.print("enter a choice: ");
					int choice = input.nextInt();					
					switch (choice) {
						case 1:
							System.out.println("The balance is " + selectedAccount.getBalance());
							break;
							
						case 2:
							System.out.print("\nEnter an amount to withdraw: ");
							double ammount = input.nextDouble();
							selectedAccount.withdraw(ammount);
							break;
							
						case 3:
							System.out.print("\nEnter an amount to deposit: ");
							ammount = input.nextDouble();
							selectedAccount.deposit(ammount);
							break;
							
						case 4:
							exitMenu = true;
							break;
							
						default:
							break;
					}
				}
			}
		}
	}
}