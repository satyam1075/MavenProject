package com.TyssClient.TestScripts;

import org.testng.annotations.Test;

public class PassDatainCmd 
{
	@Test
	public void passData() 
	{
	String url = System.getProperty("url");
	String browser = System.getProperty("browser");
	
	System.out.println(url);
	System.out.println(browser);
		
	}
}
