package com.Xpath;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.utility.Log;

public class InstagramLogInTest {
	public static WebDriver driver;
	String applicationUrlAddress="https://www.instagram.com/accounts/login/";
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		Log.info("*****Chrome Browser Launched Successfuly******");
		driver.get(applicationUrlAddress);
		
		Log.info("Navigated to Instagram LogIn page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		
		
	}
	@AfterTest
	public void tearDown()
	{
	//driver.quit();
	Log.info("******Instagram Application LogIn with chrome Browser closed*******" );
	
	}
	@Test
	public void InstagramLogInTest() throws InterruptedException
	{
		//<input aria-label="Phone number, username, or email" 
		//aria-required="true" autocapitalize="off" autocorrect="off" maxlength="75" 
		//class="_aa4b _add6 _ac4d _ap35" dir="" type="text" value="" name="username">	
		
		By InstaUsernameproperty=By.xpath("//*[@type='text']");
		WebElement InstaUsername=driver.findElement(InstaUsernameproperty);
		InstaUsername.sendKeys("Kalyani_devi_1117");
		
		//<input aria-label="Password" aria-required="true" autocapitalize="off"
		//autocorrect="off" class="_aa4b _add6 _ac4d _ap35" type="password" value="" name="password">
		
		By InstaPasswordproperty=By.xpath("//*[@type='password']");
		WebElement InstaPassword=driver.findElement(InstaPasswordproperty);
		InstaPassword.sendKeys("kalyani$17");
		
		//<button class=" _acan _acap _acas _aj1- _ap30" type="submit"><div class=""+ ""
		//x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1">Log in</div></button>
		
		 By InstaLoginproperty=By.xpath("//*[@type='submit']");
		 WebElement InstaLogin =driver.findElement(InstaLoginproperty);
		 InstaLogin.click();
		//driver.findElement(By.xpath("//div[text()='Not now']")).click();
		 
		 FluentWait<WebDriver> myWait=new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(60))
				 .pollingEvery(Duration.ofMillis(30))
				 .ignoring(NoSuchElementException.class);
		 
		WebElement A=driver.findElement(By.xpath("//div[@class='x1iyjqo2 xh8yej3']"));
		 
		 
		try{//a[@aria-label='Direct messaging - 0 new notifications link']
		WebElement messages= A.findElement(By.xpath("//a[starts-with(@aria-label,'Direct messaging')]"));
	myWait.until(ExpectedConditions.visibilityOf(messages));
	messages.click();
	 driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		
		// TODO: handle exception
		System.out.println("no element");}
		catch (StaleElementReferenceException e) {
			System.out.println("element stale");
			// TODO: handle exception
		}
	
		finally {
			
		
		
		 
		//span[text()='💗🇲 🇦 🇬 🇬 🇮 🇪 💗♪']
		 Thread.sleep(10000);
		WebElement chats= driver.findElement(By.xpath("//div[@aria-label='Chats']"));
		 WebElement maggie=chats.findElement(By.xpath("//span[text()='Vasu Ganapathi']"));
		 
		
		 myWait.until(ExpectedConditions.visibilityOf(maggie));
		 maggie.click();
		
		 
		}
		
		
		
		 
		
		
		
	}
	
	
	

}
