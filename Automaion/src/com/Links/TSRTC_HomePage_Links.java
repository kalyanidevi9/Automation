package com.Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HomePage_Links {

	private static String tsrtc_HomePageLinksCount;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","./Browsers/chromedriver.exe");
		driver=new ChromeDriver();
		
		String applicationUrlAddress="https://www.google.com/search?q=tsrtc+online&sca_esv=579719297&rlz=1C1CHBD_enIN1079IN1079&ei=6HpIZYCcLqnf2roPwOiSgA8&oq=tsrtc&gs_lp=Egxnd3Mtd2l6LXNlcnAiBXRzcnRjKgIIADIKEAAYRxjWBBiwAzIKEAAYRxjWBBiwAzIKEAAYRxjWBBiwAzIKEAAYRxjWBBiwAzIKEAAYRxjWBBiwAzIKEAAYRxjWBBiwAzIKEAAYRxjWBBiwAzIKEAAYRxjWBBiwAzIKEAAYigUYsAMYQzIKEAAYigUYsAMYQzIKEAAYigUYsAMYQzIKEAAYigUYsAMYQzIOEAAY5AIY1gQYsAPYAQEyDhAAGOQCGNYEGLAD2AEBMhYQLhiKBRjHARjRAxjIAxiwAxhD2AECMhYQLhiKBRjHARjRAxjIAxiwAxhD2AECMhYQLhiKBRjHARjRAxjIAxiwAxhD2AECMhYQLhiKBRjHARjRAxjIAxiwAxhD2AECSKoxUABYAHABeAGQAQCYAQCgAQCqAQC4AQHIAQDiAwQYACBBiAYBkAYSugYGCAEQARgJugYGCAIQARgI&sclient=gws-wiz-serp";
	    driver.get(applicationUrlAddress);
		
	    
	  //  /html/body/div[3]/div[2]/div/div[2]/div/div/div[1]/a
	  //  <a class="gb_za gb_jd gb_Ld gb_ie" href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/search%3Fq%3Dtsrtc%2Bonline%26sca_esv%3D579719297%26rlz%3D1C1CHBD_enIN1079IN1079%26ei%3D6HpIZYCcLqnf2roPwOiSgA8%26oq%3Dtsrtc%26gs_lp%3DEgxnd3Mtd2l6LXNlcnAiBXRzcnRjKgIIADIKEAAYRxjWBBiwAzIKEAAYRxjWBBiwAzIKEAAYRxjWBBiwAzIKEAAYRxjWBBiwAzIKEAAYRxjWBBiwAzIKEAAYRxjWBBiwAzIKEAAYRxjWBBiwAzIKEAAYRxjWBBiwAzIKEAAYigUYsAMYQzIKEAAYigUYsAMYQzIKEAAYigUYsAMYQzIKEAAYigUYsAMYQzIOEAAY5AIY1gQYsAPYAQEyDhAAGOQCGNYEGLAD2AEBMhYQLhiKBRjHARjRAxjIAxiwAxhD2AECMhYQLhiKBRjHARjRAxjIAxiwAxhD2AECMhYQLhiKBRjHARjRAxjIAxiwAxhD2AECMhYQLhiKBRjHARjRAxjIAxiwAxhD2AECSKoxUABYAHABeAGQAQCYAQCgAQCqAQC4AQHIAQDiAwQYACBBiAYBkAYSugYGCAEQARgJugYGCAIQARgI%26sclient%3Dgws-wiz-serp&amp;ec=GAZAAQ" target="_top"><span class="gb_Hd">Sign in</span></a>
	  //*[@id="gb"]/div/div[1]/a
	    
	    
	    By linksProperty=By.tagName("a");
	    List<WebElement>tsrtc_HomePageLinks=driver.findElements(linksProperty);
	    
	    int tsrtc__HomePageLinksCount=tsrtc_HomePageLinks.size();
	    
		System.out.println("The number of links on the Tsrtc Application HomePage are:-"+tsrtc_HomePageLinksCount);
	    
	}

}
