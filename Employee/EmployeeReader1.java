package com.employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeReader1 {

	public Employee1 readFile(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
		Employee1 employee = (Employee1) ois.readObject();
		ois.close();
		return employee;
	}

}
