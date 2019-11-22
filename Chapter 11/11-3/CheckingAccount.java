/*
Author: David Cosby
Date: 11/20/2019

Creates the CheckingAccount class, which is extended from the Account class. A checking account has an overdraft limit and a different toString() output.
*/

class CheckingAccount extends Account {
	private double overdraftLimit;
	
	public CheckingAccount(double limit) {
		super();
		this.overdraftLimit = overdraftLimit;
	}
	
	public CheckingAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public void withdraw(double amount) {
		if (getBalance() - amount < -overdraftLimit) {
			return;
		}
		else {
			super.withdraw(amount);
		}
	}
	
	@Override
	public String toString() {
		String output = "Checking Account";
		output += "\nDate created: " + getDateCreated().toString();
		output += "\nID: " + getId();
		output += "\nBalance: $" + getBalance();
		output += "\nAnnual Interest Rate: " + getAnnualInterestRate();
		output += "\nOverdraft limit: $" + overdraftLimit;
		return output;
	}
}