package com.ScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BrowserAutomation.chromeDriver;

public class BaseTest {
	
	WebDriver driver;
	String applicationUrlAddress="https://www.bing.com/";
	 
	
	public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver","./diverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		System.out.println("******Chrome Browser Launched Successfuly******");
		
		driver.get(applicationUrlAddress);
		System.out.println("Navigated to OrangeHRM Application LogIn Page");
		driver.manage().window().maximize();
	}
	
	public void applicationClose()
	{
		driver.quit();
		System.out.println("******OrangeHRM Application along with Chrome Browser Closed*****");
		
	}

}
