package com.advancedcollections;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SavingAccountTest {
	private SavingAccount savingaccount1,savingaccount2,savingaccount3,savingaccount4,savingaccount5;
	
	@Before
	public void setUp(){
		savingaccount1 = new SavingAccount(10000,"jaffer",true);
		savingaccount2 = new SavingAccount(10000,"shubham",false);
		savingaccount3 = new SavingAccount(10000,"Shiva",true);
		savingaccount4 = new SavingAccount(10000,"prasanth",false);
		savingaccount5 = new SavingAccount(10000,"Shaik",true);
	}
	
	
	@Test
	public void testForPrintingObjectsThroughArrayList() throws FileNotFoundException, IOException, ClassNotFoundException {
			List<SavingAccount> al = new ArrayList<SavingAccount>();
			al.add(savingaccount1);
			al.add(savingaccount2);
			al.add(savingaccount3);
			al.add(savingaccount4);
			al.add(savingaccount5);
	
			for (SavingAccount savingAccount : al) {
				//System.out.println(savingAccount);
			}
			for (SavingAccount savingAccount2 : al) {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Java_work\\Pilli.txt"));
				oos.writeObject(savingAccount2);
				oos.close();
			}
			for (SavingAccount savingAccount2 : al) {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Java_work\\Pilli.txt"));
				SavingAccount savingAccount=(SavingAccount) ois.readObject();
				ois.close();
				System.out.println(savingAccount2+"\n");
			}
			
			
			
	}
}
		
	

