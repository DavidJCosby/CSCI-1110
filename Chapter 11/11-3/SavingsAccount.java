/*
Author: David Cosby
Date: 11/20/2019

Creates the SavingsAccount class, which is extended from the Account class. A savings account cannot be overdrawn and has slightly different toString output.
*/


class SavingsAccount extends Account {
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}
	
@Override
	public void withdraw(double amount) {
		if (getBalance() - amount < 0) {
			return;
		}
		else {
			super.withdraw(amount);
		}
	}
		
	@Override
	public String toString() {
		String output = "Savings Account";
		output += "\nDate created: " + getDateCreated().toString();
		output += "\nID: " + getId();
		output += "\nBalance: $" + getBalance();
		output += "\nAnnual Interest Rate: " + getAnnualInterestRate();
		return output;
	}
}