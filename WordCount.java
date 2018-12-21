package com.wordcounttest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordCount {
	
	public int wordCount() throws IOException {
		//BufferedReader reader = new BufferedReader(new FileReader("C:\\Java_work\\FileExistTest.txt"));
		Scanner sc = new Scanner(new FileReader("C:\\Java_work\\FileExistTest.txt"));
		int count =0;
	    while(sc.hasNext()){
	    	sc.next();
	    	count++;
	    }

	   // System.out.println("Number of words: " + count);
		return count;

	}
}
