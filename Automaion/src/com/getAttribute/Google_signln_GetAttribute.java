package com.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_signln_GetAttribute {

	private static final String SignInClassAttributeValue = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver;
      
		//System.setProperty("webdriver.chrome.driver","./Browsers/chromedriver.exe");
		 //driver=new ChromeDriver();
		 
		 
		 System.setProperty("webdriver.gecko.driver","./Browsers/geckodriver.exe");
		 driver=new FirefoxDriver();
		 
		 String applicationUrlAddress="https://www.google.com/";
		 driver.get(applicationUrlAddress);
		/* 
		 <a class="gb_za gb_jd gb_Ld gb_ie" href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/&amp;ec=GAZAmgQ" target="_top"><span class="gb_Hd">Sign in</span></a>
		*/ 
		 
		 By signlnproperty=By.linkText("sign in");
		 WebElement signln=driver.findElement(signlnproperty);
		 
		 
		String signlnHrefAttributeValu=signln.getAttribute("href");
		System.out.println(" The class attribure value of SignIn element is :- "+SignInClassAttributeValue);

		
		String signlnClassAttributeValue=signln.getAttribute("class");
		System.setProperty("The class of attribute value of signlnelement", signlnClassAttributeValue);
		
		
		String signln_Text=signln.getText();
		System.out.println("The text of an Element sign ln on the Google Homepage is:-"+signln_Text);
		
		signln.click();
		
		driver.quit();
		
	}
}
		
