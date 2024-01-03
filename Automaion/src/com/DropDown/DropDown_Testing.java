package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown_Testing extends BaseTest{
	
	private List<WebElement> selectLanguages;

	@Test
	public void dropDownTesting()
	{
	//select Language DropDown
	//id="gtranslate_selector"
		
		 By selectDropDownLaunguageProperty=By.id("gtranslate_selector");
		WebElement selectDropDownLaunguage=driver.findElement(selectDropDownLaunguageProperty);
		
		//<option value="en|hi">Hindi</option>
		//<option value="en|fr">French</option>
		//<option value="en|de">German</option>
		//<option value="en|el">Greek</option>
		
		By dropDownProperty=By.tagName("option");
		List<WebElement>selectLanguage=selectDropDownLaunguage.findElements(dropDownProperty);
		
		for(int index=0;index<selectLanguages.size();index++)
		{
		String dropDownLanguageName=selectLanguages.get(index).getText();
		System.out.println(dropDownLanguageName);
		}
		
		Select selection=new Select(selectDropDownLaunguage);
		selection.selectByIndex(7);
		
		
		
	}

}
