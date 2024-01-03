package com.OHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Log;

public class BaseTest {
	
	WebDriver driver;
	
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	public void ApplicationLaunch()
	{
		driver=new ChromeDriver();
		Log.info("*********Chrome Browser Launch successfuly**********");
		driver.get(applicationUrlAddress);
		Log.info("********Navigate to OHRM Application LogIn Page**********");
		driver.manage().window().maximize();
		
	}
	
	public void Applicationclose()
	{
		driver.quit();
		Log.info("*********OHRM Application along with Chrome Browser Closed");
		
	}

}
