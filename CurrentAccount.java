package com.cg.account;

public abstract class CurrentAccount extends BankAccount {
	private final double creditLimit;


	public CurrentAccount(String accountHolderName, double accountBalance, double creditLimit) {
		super(accountHolderName, accountBalance);
		// TODO Auto-generated constructor stub
		this.creditLimit=creditLimit;
	}

	
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		}

	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit
				+ ", getAccountHolderName()=" + getAccountHolderName()
				+ ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	
}
