package com.inetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobjects.LoginPage;

public class Tc_LoginTest_001 extends Baseclass {
	@Test
	public void loginTest() {
		driver.get(baseURL);
		logger .info("url is opended");
		LoginPage ip = new LoginPage(driver);
		ip.setUserName(username);
		logger .info("Enter Username");
		ip.setPassword(password);
		logger .info("enter password");
		ip.clickSubmit();
		logger .info("enter submit");
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger .info("test is passed");
		} else {
			Assert.assertTrue(false);
			logger .info("test is failed");
		}

	}
}
