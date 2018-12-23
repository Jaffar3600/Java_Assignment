package com.employee;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest1 {
	private Employee1 employee;
	private EmployeeReader1 reader;
	@Before
	public void setUp() {
		employee = new Employee1(1210313759,"Prasanth",20000);
		reader = new EmployeeReader1();
	}
	

	@Test
	public void write() throws FileNotFoundException, IOException {
		String path = "C:\\Users\\user123\\Desktop\\Prasanth.txt";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
		oos.writeObject(employee);
		oos.close();
	}

	@Test
	public void read() throws FileNotFoundException, ClassNotFoundException, IOException {
		String path = "C:\\Users\\user123\\Desktop\\Prasanth.txt";
		Employee1 employee2 = reader.readFile(path);
		System.out.println(employee2);
		
	}
}
