package com.employee;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	
	private Employee employee;
	private EmployeeWrite empWrite;
	private EmployeeReader empReader;
	
	@Before
	public void setUp() {
		empWrite = new EmployeeWrite();
		empReader = new EmployeeReader();
		employee = new Employee(1234,"Jaffer",10000);
	}
	
	
	@Test
	public void test() throws FileNotFoundException, IOException {
		String path ="C:\\Users\\user123\\Desktop\\jaffer.txt";
		empWrite.main(path,employee);
	}
	@Test
	public void tes1t() throws FileNotFoundException, ClassNotFoundException, IOException{
		String path ="C:\\Users\\user123\\Desktop\\jaffer.txt";
		Employee employeeReader=empReader.main(path);
		System.out.println(employeeReader.toString());
	}
}
