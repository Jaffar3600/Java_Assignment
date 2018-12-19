package com.trainingtest;

import com.training.Training;
/**
 * 
 * @author jaffer Shaik
 * This is Corporate training which will get the cost of Corporate Training fees
 * In corporate training fee is based on number of days * fee
 *
 */
public class CorporateTraining extends Training {
	private int days;

	public CorporateTraining(String subject, double fees,int days) {
		super(subject, fees);
		this.days=days;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	
	public double getOrderValue(){
		return (getFees() * days);
	}
	
	
}
