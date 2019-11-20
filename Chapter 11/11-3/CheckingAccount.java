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
		if (getBalance() - amount < overdraftLimit) {
			return;
		}
		else {
			super.withdraw(amount);
		}
	}
}