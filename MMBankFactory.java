package com.cg.factory;

import com.cg.account.CurrentAccount;
import com.cg.account.SavingAccount;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAccount getNewSavingAccount(String accountHolderName,
			double accountBalance, boolean isSalaried) {
		
		return null;
	}

	@Override
	public CurrentAccount getNewCurrentAccount(String accountHolderName,
			double accountBalance, double creditLimit) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
