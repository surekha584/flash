package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	Properties pro;

	public Readconfig() {
		File src = new File("./configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} 
		catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}
	}

	public String getApplicationURL() 
	{
		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getUsername()
	{
		String username = pro.getProperty("username");
		return username;
	}

	public String getpassword()
	{
		String Password = pro.getProperty("password");
		return Password;
	}

	public String getchromepath()
	{
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}

	public String getiepath() 
	{
		String iepath = pro.getProperty("iepath");
		return iepath;
	}

public String getfirefoxpath()
{
		String firepath=pro.getProperty("firefoxpath");
		return firepath;
		
		
}
}
		
