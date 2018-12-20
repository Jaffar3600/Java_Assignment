package com.cg.account;

public abstract class BankAccount {
	private  int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	private static int accountNumberGenerator;
	
	static {
		accountNumberGenerator=1234;
	}
	{
		accountNumber=++accountNumberGenerator;
	}
	
	public BankAccount(String accountHolderName, double accountBalance) {
		
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public double getAccountBalance() {
		return accountBalance;
	}


	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber
				+ ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}


	public abstract void withdraw(double amount);
	public void deposit(){
		
		
	}
	
	
	
}
