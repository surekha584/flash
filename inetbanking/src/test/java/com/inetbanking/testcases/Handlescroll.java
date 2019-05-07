package com.inetbanking.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Handlescroll {

	
	
	 @Test
	 public void scrollDown(){
	 System.setProperty("webdriver.gecko.driver","D:\\surekha\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 driver.navigate().to("https://www.softwaretestingmaterial.com");
	 //to perform Scroll on application using  Selenium
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,250)", "");
	 }
}
