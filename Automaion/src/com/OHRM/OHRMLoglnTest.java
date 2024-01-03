package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.BrowserAutomation.chromeDriver;

public class OHRMLoglnTest {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./Browsers/chromedriver.exe");
		

		 driver = new ChromeDriver();
		 
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		
		/*
		 HTML - Programing Language used to develop WebPages

		Properties of UserName Element
		<input name="txtUsername" id="txtUsername" type="text">

		 < - tag
		 <input - tag Name

		 name - attribute / locator of WebDriver
		 txtUsername - value / selector

		 id - attribute / locator of WebDriver
		 txtUsername - value / selector

		 type - attribute
		 text - value
		*/
		//id="txtUsername"
driver.findElement(By.id("txtUsername")).sendKeys("yufuyi");
//id="txtPassword"
driver.findElement(By.id("txtPassword")).sendKeys("vsvfs@134");

//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
driver.findElement(By.className("button")).click();
		
//Propertys of UserName Element
//<input name="txtUsername"id="txtUsername" type="test">




		
	   
		
		
		
		
		
		

	}

}
