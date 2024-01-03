package com.ValidatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

import com.BrowserAutomation.chromeDriver;

public class ValidatingTitle_BingHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./Browsers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String applicationUrlAddress="https://www.google.com/";
		driver.get(applicationUrlAddress);
		
		String expected_BingHomePageTitle="Bing"; // should be
		System.out.println(" The expected Title of the Bing Home Page is :- "+expected_BingHomePageTitle);

		
		String actual_bingHomePageTitle=driver.getTitle();
		System.out.println(" The actual title of the Bing Home Page is :- "+actual_bingHomePageTitle);

		
		// Validating the Title of the Bing HomePage

		if(actual_bingHomePageTitle.equals(expected_BingHomePageTitle))
		{
		System.out.println(" Title of the Bing HomePage Matched - PASS");
		}
		
		
		else
		{
		System.out.println(" Title of the Bing HomePage NOT Matched - FAIL");
		}

		driver.quit();

	}

}
