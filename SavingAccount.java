package com.cg.account;

public abstract class SavingAccount extends BankAccount {
	private boolean isSalaried;
	private static final double minbalance =0;
	
	
	public SavingAccount(String accountHolderName, int accountBalance,
			boolean isSalaried) {
		super(accountHolderName, accountBalance);
		this.isSalaried = isSalaried;
	}
	
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "SavingAccount [isSalaried=" + isSalaried
				+ ", getAccountHolderName()=" + getAccountHolderName()
				+ ", getAccountBalance()=" + getAccountBalance() + "]";
	}
	
	
	
}
