package com.ValidatingUrlAddress;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingGoogleHomePage_TitleandUrlAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		ChromeDriver driver;

		driver = new ChromeDriver();

       String applicationUrlAddress="https://www.google.com/";
       driver.get(applicationUrlAddress);
       
       String expectedGoogleHomePageTitle="Google";
       System.out.println(" The Expected title of the Google HomePage is :- "+expectedGoogleHomePageTitle);

       // getting the title of the Google HomePage
       String actualGogleHomePageTitle=driver.getTitle();
       System.out.println(" The Actual title of the Google HomePage is :- "+actualGogleHomePageTitle);

       if(actualGogleHomePageTitle.equals(expectedGoogleHomePageTitle))
       {
       System.out.println(" The Title of the Google HomePage matched - PASS");
       }
       else
       {
       System.out.println(" The title of the Google HomePage NOT Matched - FAIl");
       }

       System.out.println();
       
    // Validating Google HomePage URl Address

       String expectedGoogleHomePageUrlAddress="google.com";
       System.out.println(" The expected URl address of the Google HomePage is :- "+expectedGoogleHomePageUrlAddress);

       // getting the URL Address of the Current WebPage
       String actualGoogleHomePageCurrentUrlAddress=driver.getCurrentUrl();
       System.out.println(" The Actual Current URL Address of the Google HomePage is :- "+actualGoogleHomePageCurrentUrlAddress);

       if(actualGoogleHomePageCurrentUrlAddress.contains(expectedGoogleHomePageUrlAddress))
       {
       System.out.println(" Url address Found in the GoogleHomePage - PASS");
       }
       else
       {
    	   System.out.println(" Expected Url Address is not Found in the GoogleHomePage - FAIL");
       }

       driver.quit();
       }
	}


