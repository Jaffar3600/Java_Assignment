package com.training;

/**
 * 
 * @author jaffar Shaik
 *  This is Public training which will get the cost of Public Training fees
 * In this Public Training total Fee cost return as Total number of Participants * Fee
 */
public class PublicTraining extends Training {
	private int participants;
	

	public PublicTraining(String subject, double fees, int participants) {
		super( subject, fees);
		this.participants= participants;
		
	}
	public int getParticipants() {
		return participants;
	}
	public void setParticipants(int participants) {
		this.participants = participants;
	}
	public double getOrderValue(){
		
		return (getFees() * participants);
	}

}
