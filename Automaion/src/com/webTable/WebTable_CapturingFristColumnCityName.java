package com.webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_CapturingFristColumnCityName extends BaseTest {
	
	@Test
	public void WebTable_CapturingFristColumnCityName()
	{
		
	for(int index=1;index<=36;index++)
	{
		By fristColumnCityNameproperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+index+"]/td[1]");
		WebElement cityName=driver.findElement(fristColumnCityNameproperty);
		 String cityNameText=cityName.getText();
		 System.out.println(cityNameText);
		 
	}

}
}