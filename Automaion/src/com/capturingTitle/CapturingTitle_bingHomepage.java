package com.capturingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingTitle_bingHomepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver","./Browsers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	
		String applicationUrlAddress="http://bing.com";
		driver.get(applicationUrlAddress);

		// getting the Bing Home Page Title
		String bingHomePageTitle=driver.getTitle();
		System.out.println(" The title of the Bing Home Page is :- "+bingHomePageTitle);

		driver.quit();
	}

}
