package com.DropDown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public static WebDriver driver;
	
	String applicationUrlAddress="https://www.osmania.ac.in/";
	@BeforeTest
	public void applicationLaunch()
	{
		driver=new ChromeDriver();
		
		System.out.println("********Chrome Browser Launched succesfuly*******");
		driver.get(applicationUrlAddress);
		System.out.println("Navigate to osmania Application along with Chrome Browser");
		
		driver.manage().window().maximize();
	}
	@AfterTest
	public void applicationClose()
	{
		driver.quit();
		System.out.println("*********osmania Application along with Chrome Browser Close*********");
	}

}
