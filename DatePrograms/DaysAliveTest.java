package com.capgemini.training.date;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class DaysAliveTest {
	private DaysAlive daysAlive;

	@Test
	public void daysAlivetest() {
		daysAlive=new DaysAlive();
		LocalDate dateBefore = LocalDate.of(1996, Month.OCTOBER, 30);
	
		long numberOfDays=daysAlive.numberOfDaysAlive(dateBefore);
		assertEquals(8091,numberOfDays);
		
		
	}

}
