package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_signIn_Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ChromeDriver driver;

		WebDriver driver;
		// WebDriver is an interface of the Selenium
		//System.setProperty("webdriver.chrome.driver","./Browsers/chromedriver.exe");
		//driver=new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","./Browsers/geckodriver.exe");
		driver=new FirefoxDriver();
		
		String applicationUrlAddress="https://www.google.com/";
		driver.get(applicationUrlAddress);
		
		/*
		<a href="https://www.google.com/;
       continue=https://www.google.com/"
       target="_top">
       Sign in</span></a>
        */
		

     /*
       By signInProperty=By.className("gb_Dd");
       WebElement signIn=driver.findElement(signInProperty);
       signIn.click();
       */

       /*
         <a href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;
         continue=https://www.google.com/&amp;ec=GAZAmgQ" target="_top">
        Sign in</span></a>
		*/
		
		/* < - tag
		 a - tagName - an anchor Tag
		 href - attribute
		 value - https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;
		          continue=https://www.google.com/&amp;ec=GAZAmgQ


		  The Type of Element is - link

		   locator - linkText
		   selector - Sign in

		*/
		

		By signInProperty=By.linkText("Sign in");
		WebElement signIn=driver.findElement(signInProperty);
		signIn.click();

        

		}

		 
	 
		 
	 
		 
	}
	

		
		 
		 
		
		
	


