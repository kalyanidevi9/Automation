package com.webTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.BrowserAutomation.chromeDriver;

public class BaseTest {
	
	WebDriver driver;
	String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
	
	@BeforeTest
	
	public void setUp()
	{
		driver=new ChromeDriver();
		
		System.out.println("*****chrome driver launch successfuly******");
		
		driver.get(applicationUrlAddress);
		System.out.println("Navigate to wrold clock Application LogIn page");
		driver.manage().window().maximize();
		
	}
	@AfterTest
	
	public void tearDown()
	{
		driver.quit();
		System.out.println("*****wrold clock Application LoIn along with chrome Brower closed******** ");
		
		
	}
	
	

}
