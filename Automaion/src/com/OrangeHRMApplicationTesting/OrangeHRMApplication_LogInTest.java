package com.OrangeHRMApplicationTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BrowserAutomation.chromeDriver;


public class OrangeHRMApplication_LogInTest {
	
	public static WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

	FileInputStream testDataFile;
	XSSFWorkbook workBook;
	XSSFSheet testDataSheet;
	Row testDataRow;
	
	public void applicationLaunch()
	{
	//System.setProperty("webdriver.chrome.driver","./diverfiles/chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get(applicationUrlAddress);
	
	driver.manage().window().maximize();
	
	}
	
	public void appilcationClose()
	{
	driver.quit();	
	}
	
	public void logInTest() throws IOException
	{
		testDataFile=new FileInputStream("C:\\Users\\Hp\\Desktop\\Kalayani\\Automaion\\Resources\\Book4.xlsx");
		workBook=new XSSFWorkbook(testDataFile);
		testDataSheet=workBook.getSheet("sheet1");
		

		// getting the UserName Test  Data
		testDataRow=testDataSheet.getRow(5);
		Cell userNameTestDataRowOfCell= testDataRow.getCell(1);
		
		String userNameTestData=userNameTestDataRowOfCell.getStringCellValue();
		// String userNameTestData="srini";

		    By userNameProperty=By.id("txtUsername"); // identifying the property of an element
		    WebElement userName=driver.findElement(userNameProperty);// identifying the element on the WebPage
		    userName.sendKeys(userNameTestData); // Performing Operation on the Element
		    
		    // getting the test data from the ExcelFile - Password
		    
		    Cell passwordTestDataCell=testDataRow.getCell(2);
		    String passwordTestData=passwordTestDataCell.getStringCellValue();
		    
		    //  String passwordTestData="Livetech@123";
		    
		    // <input name="txtPassword" autocomplete="off" type="password">
		       By passwordProperty=By.name("txtPassword");
		       WebElement password=driver.findElement(passwordProperty);
		       password.sendKeys(passwordTestData);
		       
		       // <input type="submit"  class="button"  value="LOGIN">
		       By logInButtonProperty=By.className("button");
		       WebElement logInButton=driver.findElement(logInButtonProperty);
		       logInButton.click();
		      }
	
	public void LogOutTest() throws IOException, InterruptedException
	{
	//id="Welcome"	
		  By welComeAdminProperty=By.id("welcome");
		    WebElement welComeAdmin=driver.findElement(welComeAdminProperty);
		    
		    String expected_OrangeHRMApplicationHomePageText="Welcome Admin";
		    System.out.println(" The Expected Text of OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);
		   
		    String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
		    System.out.println(" The Actual Text of OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);
		   
		    if(actual_OrangeHRMApplicationHomePageText.equals(expected_OrangeHRMApplicationHomePageText))
		    {
		    System.out.println(" Successfully  Navigated to OrangeHRM Application HomePage - PASS ");
		    Cell testResultCell=testDataRow.createCell(4);
		    testResultCell.setCellValue("Successfully  Navigated to OrangeHRM Application HomePage - PASS");
		   
		    }
		    
		    else
		    {
		    System.out.println(" Failed to Navigate to OrangeHRM Application HomePage - FAIL ");
		    Cell testResultCell=testDataRow.createCell(4);
		    testResultCell.setCellValue("Failed to Navigate to OrangeHRM Application HomePage - FAIL ");
		    }
		   
		    FileOutputStream testResultFile = new FileOutputStream("C:\\Users\\Hp\\Desktop\\Kalayani\\Automaion\\Resources\\Book4.xlsx");
		    workBook.write(testResultFile);
		   
		    welComeAdmin.click();
		   
		    // Synchronization
		   
		    Thread.sleep(5000); // wait time of Java - will be implemented only for the next statement
		   
		    // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		    // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		       
		    By logOutProperty=By.linkText("Logout");
		    WebElement logOut=driver.findElement(logOutProperty);
		    logOut.click();
		   
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		OrangeHRMApplication_LogInTest logIn = new OrangeHRMApplication_LogInTest();
		logIn.applicationLaunch();
		logIn.logInTest();
		logIn.LogOutTest();
		logIn.appilcationClose();

	}

}
