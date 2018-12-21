package com.LineCountingInFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LinesCount {

	public int countLines() throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Java_work\\FileExistTest.txt"));
		int lines = 0;
		while(reader.readLine()!=null){
			lines++;
		}
		reader.close();
		
		return lines;
		
	}
	
	
}
