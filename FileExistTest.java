package com.FileExist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FileExistTest {
	private FileExist fileexist;
	
	
	@Before
	public void setUp(){
		fileexist = new FileExist();
	}
	
	@Test
	public void testForFileExist() {
		boolean result = fileexist.fileExist();
		assertEquals(true,result);
	}

}
