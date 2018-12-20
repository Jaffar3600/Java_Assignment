package com.cg.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.account.CurrentAccount;
import com.cg.account.SavingAccount;
import com.cg.factory.BankFactory;
import com.cg.factory.MMBankFactory;

public class BankFactoryTest {
	
	@Test
	public void test() {
	 BankFactory bankfactory = new MMBankFactory();
	 SavingAccount s1 = bankfactory.getNewSavingAccount("Jaffar",10000.0,true);
	}

	@Test
	public void testCurrentAccount() {
	 BankFactory bankfactory = new MMBankFactory();
	CurrentAccount s2 = bankfactory.getNewCurrentAccount("Jaffar",15000,50);
	}

}
