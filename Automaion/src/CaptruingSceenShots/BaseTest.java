package CaptruingSceenShots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver;
	String applicationUrlAssress="https://www.google.com/search?q=tsrtc&rlz=1C1CHBD_enIN1079IN1079&oq";
	
	@BeforeTest
	public void setUp()
	{
	System.setProperty("webdriver.chrome.driver","./diverfiles/chromedriver.exe");
	driver=new ChromeDriver();
	
	System.out.println("*****chrome Browser Launched successfuly*****");
	
	driver.get(applicationUrlAssress);
	System.out.println("Navigated to OrangeHRM Application LogIn Page");
	driver.manage().window().maximize();
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		System.out.println("*****OrangeHRM Application along with chrome Browser Closed*****");
		
		
	}
	

}
