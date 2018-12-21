package com.searchwordinfile;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class GreapApplication {
	private GrepApp searchword;
	
	@Before
	public void setUp(){
		searchword = new GrepApp();
	}
	
	
	@Test
	public void testForsearchWord() throws IOException {
		String result = searchword.searchWord();
		assertEquals("8 hi For",result);
		
	}

}
