package com.ApplicationLaunch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateToBingHomepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();

		
		System.setProperty("webdriver.edge.driver", "./Browsers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();

		driver.get("http://bing.com");
		// driver.navigate().to("http://google.com");
		driver.get("http://google.com");

		// driver.close(); // will close the Browser - if it has a single TAB opened in it

		driver.quit(); // if it has a single TAB opened in it  
//		              AND
		               // will close the Browser - with all the TAB's opened in it at Once

	}

}
