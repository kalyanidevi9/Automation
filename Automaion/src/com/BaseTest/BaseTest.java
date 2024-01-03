package com.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.utility.Log;

public class BaseTest {
	
public static WebDriver driver;
String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	Log.info("*******Chrome Browser Lanuched Successfuly******");
	
}


	}


