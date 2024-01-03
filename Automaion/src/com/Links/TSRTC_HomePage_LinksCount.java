package com.Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.StackManipulation.Size;

public class TSRTC_HomePage_LinksCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","./Browsers/chromedriver.exe");
		driver=new ChromeDriver();
		
		String applicationUrlAddress="https://www.tsrtc.telangana.gov.in/";
		driver.get(applicationUrlAddress);
		
		//html/body/div[3]/div[2]/div/div[2]/div/div/div[1]/a/span
		//<span class="gb_Hd">Sign in</span>
		//*[@id="gb"]/div/div[1]/a/span
		
		//<input type="text" name="fromPlaceName" size="22" value="" onblur="setHelpText('Enter From City Name', 'fromPlaceName');" onfocus="clearHelpText('Enter From City Name', 'fromPlaceName');" id="fromPlaceName" class="ajxPlaceCs ui-autocomplete-input" title="Enter city name and select from the dropdown list." autocomplete="off">

		//<input type="button" name="searchBtn" id="searchBtn" class="chkavailabilityBtn" value="Check Availability" title="Search" onclick="validateBookingSearch(this.form, '/oprs-web/avail/services.do');">

		By linksproperty=By.tagName("a");
		List<WebElement>tsrtc_HomePageLinks=driver.findElements(linksproperty);
		
		int tsrtc_HomePageLinksCount=tsrtc_HomePageLinks.size();
		System.out.println("The number of links on theTSRTC Application HomePage are:-"+tsrtc_HomePageLinksCount);
		
		driver.quit();
		
		
		
	}

}
