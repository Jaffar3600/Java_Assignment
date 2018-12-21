package com.FileExist;

import java.io.File;

public class FileExist {
	public boolean fileExist(){
	File file = new File("C:\\Java_work\\FileExistTest.txt");
	
	if(file.exists())
		return true;
	else
	return false;
}
}
