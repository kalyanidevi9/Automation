package com.MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Hp\\Desktop\\Kalayani\\Automaion\\diverfiles\\msedgedriver.exe");
		driver=new EdgeDriver();
		
		String applicationUrlAddress="https://www.amazon.com/";
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		By helloSignlnProperty=By.id("nav-link-accountList");
		WebElement hellosignln=driver.findElement(helloSignlnProperty);
		
		Actions action=new Actions(driver);
		action.moveToElement(hellosignln).build().perform();
		
		// Operation on YourOrders - is an Hidden Element

		// Selenium WebDriver cannot directly recognize the Hidden Elements - first the element which
		// is hidden should be made visible - then the webdriver can recognize and Automate the element

		
		// <a id="nav_prefetch_yourorders" href="/gp/css/order-history?ref_=nav_AccountFlyout_orders" class="nav-link nav-item"><span class="nav-text">Your Orders</span></a>
		
		// The type of element is link

		By yourOrdersProperty=By.linkText("Orders");
		WebElement yourOrders=driver.findElement(yourOrdersProperty);
		yourOrders.click();

		System.out.println(driver.getTitle());

		driver.quit();
		
		
	}
		
}	
		
		
		
		
		
		
	


