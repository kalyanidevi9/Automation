package com.Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_Homepage_DisplayLinkNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","./Browsers/chromedriver.exe");
		driver=new ChromeDriver();
		
		String applicationUrlAddress="https://www.google.com/search?q=tsrtc&rlz=1C1CHBD_enIN1079IN1079&oq=tsrtc&gs_lcrp=EgZjaHJvbWUqCQgAECMYJxiKBTIJCAAQIxgnGIoFMhMIARAuGIMBGMcBGLEDGNEDGIAEMg0IAhAAGIMBGLEDGIAEMgoIAxAAGLEDGIAEMgoIBBAAGLEDGIAEMg0IBRAAGIMBGLEDGIAEMgcIBhAAGIAEMgQIBxAF0gEINDc1N2owajeoAgCwAgA&sourceid=chrome&ie=UTF-8";
		driver.get(applicationUrlAddress);
		
		///html/body/div[3]/div[2]/div/div[2]/div/div/div[1]/a
		//*[@id="gb"]/div/div[1]/a
		//<a class="gb_za gb_jd gb_Ld gb_ie" href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/search%3Fq%3Dtsrtc%26rlz%3D1C1CHBD_enIN1079IN1079%26oq%3Dtsrtc%26gs_lcrp%3DEgZjaHJvbWUqCQgAECMYJxiKBTIJCAAQIxgnGIoFMhMIARAuGIMBGMcBGLEDGNEDGIAEMg0IAhAAGIMBGLEDGIAEMgoIAxAAGLEDGIAEMgoIBBAAGLEDGIAEMg0IBRAAGIMBGLEDGIAEMgcIBhAAGIAEMgQIBxAF0gEINDc1N2owajeoAgCwAgA%26sourceid%3Dchrome%26ie%3DUTF-8&amp;ec=GAZAAQ" target="_top"><span class="gb_Hd">Sign in</span></a>
	
		//<input type="text" name="fromPlaceName" size="22" value="" onblur="setHelpText('Enter From City Name', 'fromPlaceName');" onfocus="clearHelpText('Enter From City Name', 'fromPlaceName');" id="fromPlaceName" class="ajxPlaceCs ui-autocomplete-input" title="Enter city name and select from the dropdown list." autocomplete="off">

		//<input type="button" name="searchBtn" id="searchBtn" class="chkavailabilityBtn" value="Check Availability" title="Search" onclick="validateBookingSearch(this.form, '/oprs-web/avail/services.do');">


		

		// a common property to find the number of links is - anchor tag - 'a'

		By linksProperty=By.tagName("a");
		List<WebElement>tsrtc_HomePageLinks=driver.findElements(linksProperty);


		int tsrtc_HomePageLinksCount=tsrtc_HomePageLinks.size();
		System.out.println(" The number of links on the TSRTC Application HomePage are:- "+tsrtc_HomePageLinksCount);

		for(int index=0;index<tsrtc_HomePageLinksCount;index++)
		{
		String tsrtc_HomePageLinkName=tsrtc_HomePageLinks.get(index).getText();
		System.out.println(index+" "+tsrtc_HomePageLinkName);
		}



		driver.quit();


		}

	

}
