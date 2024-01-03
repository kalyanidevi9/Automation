package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragMeToMyTargert_GetText {
	
	static WebDriver driver;
	
	public void applicationLaunch()
	{
		//WebDriver is an interface of the selenium
		System.setProperty("webdriver.chrome.driver","./diverfiles/chromedriver.exe");
		driver=new ChromeDriver(); 
	
		String applicationUrlAddress="https://jqueryui.com/droppable/";
		driver.get(applicationUrlAddress);
	
	}
	public void applicationClose()
	{
		driver.quit();
	}
	
	public void dragAadDrop_GetText()throws InterruptedException
	{
		// Properties of the Frame of the WebPage
		// <iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>


		By webPageFrameProperty=By.className("demo-frame");
		WebElement webPageFrame=driver.findElement(webPageFrameProperty);

		// getting into the Frame of the WebPage
		driver.switchTo().frame(webPageFrame);

		// id="draggable"
		// id="draggable"

		// Thread.sleep(10000);

		By dragMeToMyTargetProperty=By.id("draggable");
		WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetProperty);

		String dragMeToMyTargetText=dragMeToMyTarget.getText();
		System.out.println(" The text of an Element Drag Me To My Target is :- "+dragMeToMyTargetText);

		// id="droppable"
		By droppableProperty=By.id("droppable");
		WebElement droppable=driver.findElement(droppableProperty);	
		

      String droppableText=droppable.getText();
      System.out.println(" The text of the Element Droppable is :- "+droppableText);


	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		// BaseTest application = new BaseTest();
		// application.applicationLaunch();

		DragMeToMyTargert_GetText drag = new DragMeToMyTargert_GetText();
		drag.applicationLaunch();
		drag.dragAadDrop_GetText();
		drag.applicationClose();	
	}

}
