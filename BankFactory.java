package com.cg.factory;

import com.cg.account.CurrentAccount;
import com.cg.account.SavingAccount;

public abstract class BankFactory {

	public abstract SavingAccount getNewSavingAccount(String accountHolderName,double accountBalance, boolean isSalaried) ;  //AccNo, accNm, accBal, isSalaried
	
	public abstract CurrentAccount getNewCurrentAccount(String accountHolderName,double accountBalance, double creditLimit) ;  // AccNo, accNm, accBal, creditLimit

	
}
