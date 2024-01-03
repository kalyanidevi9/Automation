package com.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Bing_Screenshot extends BaseTest {
	
	public void bingScreenshotTest() throws IOException
	{
		File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenShot,new File("./ScreenShots/bingHomePage.Png"));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Bing_Screenshot captruingScreenShot=new Bing_Screenshot();
		captruingScreenShot.applicationLaunch();
		captruingScreenShot.bingScreenshotTest();
		captruingScreenShot.applicationClose();

	}

}
