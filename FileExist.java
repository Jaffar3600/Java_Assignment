package com.FileExist;

import java.io.File;

public class FileExist {
	public boolean fileExist(String path){
	File file = new File(path);
	
	if(file.exists())
		return true;
	else
	return false;
}
}
