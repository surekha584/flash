package com.inetbanking.testcases;
import org.testng.annotations.*;
public class Prority {
	
	
	
	 @Test(priority=2)
	 public void testCase1() {  
	 System.out.println("Test Case 1");
	 }
	 @Test(priority=0)
	 public void testCase2() { 
	 System.out.println("Test Case 2");
	 }
	}


