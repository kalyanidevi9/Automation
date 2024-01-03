package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chromeDriver {

	public static void main(String[] args) {

		// Automating Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\Kalayani\\Automaion\\Browsers\\chromedriver.exe");

		// Class     object
		ChromeDriver chromeDriver = new ChromeDriver();

		// Automating FireFox Browser
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Hp\\Desktop\\Kalayani\\Automaion\\Browsers\\geckodriver.exe");
		FirefoxDriver firefoxDriver = new FirefoxDriver();

		// Automating MicroSoft Edge Browser
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Hp\\Desktop\\Kalayani\\Automaion\\Browsers\\msedgedriver.exe");
	
	
		
	}


	
		
	}


		
	
		
	


