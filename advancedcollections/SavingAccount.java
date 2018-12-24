package com.advancedcollections;

import java.io.FileWriter;
import java.io.Serializable;

public class SavingAccount implements Serializable{
	private double accountbalance;
	private int accountid;
	private String accountholdername;
	private boolean issalariedaccount;
	private static int accountidGenerator;
	
	{
		accountid=++accountidGenerator;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accountbalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime
				* result
				+ ((accountholdername == null) ? 0 : accountholdername
						.hashCode());
		result = prime * result + (issalariedaccount ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingAccount other = (SavingAccount) obj;
		if (Double.doubleToLongBits(accountbalance) != Double
				.doubleToLongBits(other.accountbalance))
			return false;
		if (accountholdername == null) {
			if (other.accountholdername != null)
				return false;
		} else if (!accountholdername.equals(other.accountholdername))
			return false;
		if (issalariedaccount != other.issalariedaccount)
			return false;
		return true;
	}

	public SavingAccount(double accountbalance, String accountholdername,
			boolean issalariedaccount) {
		super();
		this.accountbalance = accountbalance;
		this.accountholdername = accountholdername;
		this.issalariedaccount = issalariedaccount;
	}

	@Override
	public String toString() {
		return "SavingAccount [accountbalance=" + accountbalance
				+ ", accountid=" + accountid + ", accountholdername="
				+ accountholdername + ", issalariedaccount="
				+ issalariedaccount + "]";
	}
	
	
	
}
