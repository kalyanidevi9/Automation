package com.OrangeHRMApplicationFunctionalitiesTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	public void applicationLaunch()
	{
	System.setProperty("webdriver.chrome.driver","./diverfiles/chromedriver.exe");	
	driver=new ChromeDriver();
	
	System.out.println("*********Chrome Browser Launched successfuly******");
	
	driver.get(applicationUrlAddress);
	System.out.println("Navigate to OrangeHRM Application LogIn Page");
	driver.manage().window().maximize();
	}
	
	public void applicationClose()
	{
		driver.quit();
		System.out.println("*******OrangeHRM Application along with chrome Browser Closed******");
		
	}
	



	}


