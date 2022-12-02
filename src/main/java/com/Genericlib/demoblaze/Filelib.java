package com.Genericlib.demoblaze;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Filelib 
{
	String path="Test/Test.properties";
	
	public String getdataFromproperties(String key) throws IOException
	{
		FileInputStream FIS=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(FIS);
		String data=prop.getProperty(key);
		return data;
		
		
	}

}
