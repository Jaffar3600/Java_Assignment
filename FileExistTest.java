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
		boolean result = fileexist.fileExist("C:\\Java_work\\FileExistTest.txt");
		assertEquals(true,result);
	}
	
	@Test
	public void testForFileExist1() {
		//String path = "C:\\Java_work\\FileExistTest.txt";
		boolean result = fileexist.fileExist("C:\\Java_work\\FileExistTestp.txt");
		assertEquals(false,result);
	}

}
