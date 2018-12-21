package com.searchwordinfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GrepApp {
		
	public String searchWord() throws IOException{

		   BufferedReader br=new BufferedReader(new FileReader("C:\\Java_work\\FileExistTest.txt"));
		   String line;
		   int linecount=0;
		    
		   String keyword="hi ";
		   while ((line=br.readLine())!=null){
			   linecount++;
		      if(line.contains(keyword)){
		    	  return (linecount+" "+line); 
		      }
		    	 
	}
		return (linecount+" "+line);
	
}
}
