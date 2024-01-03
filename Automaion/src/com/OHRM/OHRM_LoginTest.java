package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./Browsers/chromedriver.exe");
		ChromeDriver driver;

		driver = new ChromeDriver();
		
		//String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		//driver.get(applicationUrlAddress);
		

		/*
		 HTML - Programing Language used to develop WebPages

Properties of UserName Element
<input name="txtUsername" id="txtUsername" type="text">/

 < - tag
 <input - tag Name

 name - attribute / locator of WebDriver
 txtUsername - value / selector

 id - attribute / locator of WebDriver
 txtUsername - value / selector

 type - attribute
 text - value
*/

driver.findElement(By.id("txtUsername")).sendKeys("srini");

// <input name="txtPassword" autocomplete="off" type="password">

driver.findElement(By.name("txtPassword")).sendKeys("Q@Trainer7");

// <input type="submit"  class="button"  value="LOGIN">

driver.findElement(By.className("button")).click();



	}

}
