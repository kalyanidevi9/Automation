package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_Homepage_LinnksCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		// WebDriver is an interface of the Selenium

		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		driver.get(applicationUrlAddress);

		/*
		<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>

		<a href="#" onclick="populateSearch('1386430615487', 'Bangalore', '5231', 'Hyderabad');"> Bangalore - Hyderabad</a>

		<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>


		<input type="text" name="fromPlaceName" size="22" value="" onblur="setHelpText('Enter From City Name', 'fromPlaceName');" onfocus="clearHelpText('Enter From City Name', 'fromPlaceName');" id="fromPlaceName" class="ajxPlaceCs ui-autocomplete-input" title="Enter city name and select from the dropdown list." autocomplete="off">

		<input type="button" name="searchBtn" id="searchBtn" class="chkavailabilityBtn" value="Check Availability" title="Search" onclick="validateBookingSearch(this.form, '/oprs-web/avail/services.do');">


		*/

		// a common property to find the number of links is - anchor tag - 'a'

		By linksProperty=By.tagName("a");
		List<WebElement>tsrtc_HomePageLinks=driver.findElements(linksProperty);


		int tsrtc_HomePageLinksCount=tsrtc_HomePageLinks.size();
		System.out.println(" The number of links on the TSRTC Application HomePage are:- "+tsrtc_HomePageLinksCount);


		driver.quit();

		}

	}


