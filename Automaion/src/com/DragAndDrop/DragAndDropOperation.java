
package com.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOperation {
	
	WebDriver driver;
	private WebElement dragMeToMyTarget;
	private String Webpageframe;
	private String droppableText;
	private WebElement droppable;
	
	public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver","./diverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		String applicationUrlAddress="https://jqueryui.com/droppable/";
		driver.get(applicationUrlAddress);
		}
	
	public void applicationClose()
	{
		driver.quit();
	}
	
	public void dragAndDrop_GetText() throws InterruptedException
	
	{
		By webPageFrameProperty=By.className("demo-frame");
		WebElement webPageFrame=driver.findElement(webPageFrameProperty);

	
	// getting into the Frame of the WebPage
	driver.switchTo().frame(webPageFrame);

	// id="draggable"
	// id="draggable"

	// Thread.sleep(10000);
	
	
	By dragMeToMyTargetproperty=By.id("draggable");
	WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetproperty);
	
	String dragMeToMyTargetText=dragMeToMyTarget.getText();
	System.out.println("The text of the Element Droppable is :-"+dragMeToMyTargetText);
	WebElement dr=driver.findElement(By.id("droppable"));
	// Perform Drag and  Drop Operation
	Actions action = new Actions(driver);
	action.dragAndDrop(dragMeToMyTarget, dr).build().perform();

	// driver focus should back to the actual WebPage , because the resizable element is not
   //  in the same Frame

    driver.switchTo().defaultContent();
			
 // Automating Resizable Element
 // <a href="https://jqueryui.com/resizable/">Resizable</a>
 // <a href="https://jqueryui.com/resizable/">Resizable</a>

 //Thread.sleep(10000);
    
    By resizableProperty=By.linkText("Resizable");
    WebElement resizable=driver.findElement(resizableProperty);
    resizable.click();

    System.out.println(driver.getTitle());
    
    
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		//BaseTextapplication=new BaseTest();
		//application.applicationLaunch()
		
		DragAndDropOperation drag= new DragAndDropOperation();
		drag.applicationLaunch();
		drag.dragAndDrop_GetText();
		//drag.applicationClose();
		
		
		
	}

}
