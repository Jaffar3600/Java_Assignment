package com.LineCountingInFile;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class LinesCountingTest {
	private LinesCount linescount;
	
	@Before
	public void setUp(){
		linescount = new LinesCount();
	}
	
	
	@Test
	public void testForCountingLines() throws IOException {
		int count = linescount.countLines();
		assertEquals(2,count);
		
	}

}
