package com.webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_FristRowofFristCell_GetCityName extends BaseTest {
	
	@Test
	public void getCityName()
	{
	By FristRowofFristCell_cityNameproperty	=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
	WebElement cityName=driver.findElement(FristRowofFristCell_cityNameproperty);
	String cityNameText=cityName.getText();
	
	System.out.println("The city name is:-"+cityNameText);
	
		
	}

}
