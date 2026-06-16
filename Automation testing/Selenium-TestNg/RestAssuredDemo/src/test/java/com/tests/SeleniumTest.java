package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumTest {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		try {
			driver.get("https://jsonplaceholder.typicode.com/");
			
			String currentUrl=driver.getCurrentUrl();
			System.out.println("Current url : "+currentUrl);
			
			Assert.assertTrue(currentUrl.toLowerCase().contains("jsonplaceholder"));
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			driver.close();
		}
	}
}
