package com.OrangeHRMApplicationFunctionalitiesTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrangeHRMApplication_LogInTest extends BaseTest {
	
	
	FileInputStream testDataFile;
	XSSFWorkbook workBook;
	XSSFSheet testDatasheet;
	Row testDataRow;
	
	
	
	public  void logInTest() throws IOException
	{
	testDataFile=new FileInputStream("C:\\Users\\Hp\\Desktop\\Kalayani\\Automaion\\Resources\\Book5.xlsx");
	workBook=new XSSFWorkbook(testDataFile);
	testDatasheet=workBook.getSheet("Sheet1");
	
	testDataRow=testDatasheet.getRow(6);
	Cell userNameTestDataRowofCell=testDataRow.getCell(4);
	String userNameTestData=userNameTestDataRowofCell.getStringCellValue();
	
	
	//String userNameTestData="kalyani17";
	By userNameProperty=By.id("txtUsername");
	WebElement userName=driver.findElement(userNameProperty);
	userName.sendKeys(userNameTestData);
	
	Cell PasswordTestDataCell=testDataRow.getCell(5);
	String PasswordTestData=PasswordTestDataCell.getStringCellValue();
	
	//string PasswordTestData="Livetech@123";
	
	
	By PasswordProperty=By.id("txtPassword");
	WebElement password=driver.findElement(PasswordProperty);
    password.sendKeys(PasswordTestData);
    
    By logInButtonProperty=By.id("btnLogin");
    WebElement logInButton=driver.findElement(logInButtonProperty);
    logInButton.click();
    
    }
	
	public void logOutTest() throws IOException, InterruptedException  
	{
	//	id="Welcome";
		By welcomeAdminProperty=By.id("welcome");
		WebElement welcomeAdmin=driver.findElement(welcomeAdminProperty);
		
		   String expected_OrangeHRMApplicationHomePageText="Welcome Admin";
		    System.out.println(" The Expected Text of OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);
		   
		    String actual_OrangeHRMApplicationHomePageText=welcomeAdmin.getText();
		    System.out.println(" The Actual Text of OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);
		   
		    if(actual_OrangeHRMApplicationHomePageText.equals(expected_OrangeHRMApplicationHomePageText))
		    {
		    System.out.println(" Successfully  Navigated to OrangeHRM Application HomePage - PASS ");
		    Cell testResultCell=testDataRow.createCell(2);
		    testResultCell.setCellValue("Successfully  Navigated to OrangeHRM Application HomePage - PASS");
		    }
		    else
		    {
		    	  System.out.println(" Failed to Navigate to OrangeHRM Application HomePage - FAIL ");
		    	    Cell testResultCell=testDataRow.createCell(2);
		    	    testResultCell.setCellValue("Failed to Navigate to OrangeHRM Application HomePage - FAIL ");
		    	    	
		    }
		    
		    FileOutputStream testResultFile = new FileOutputStream("C:\\Users\\Hp\\Desktop\\Kalayani\\Automaion\\Resources\\Book5.xlsx");
		    workBook.write(testResultFile);
		   
		    welcomeAdmin.click();
		   
		    // Synchronization
		
		    Thread.sleep(5000); // wait time of Java - will be implemented only for the next statement
		    
		    // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		    // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		       
		    By logOutProperty=By.linkText("Logout");
		    WebElement logOut=driver.findElement(logOutProperty);
		    logOut.click();
		
	}
	
	

	public static void main(String[] args) throws IOException, InterruptedException  {
		// TODO Auto-generated method stub
		OrangeHRMApplication_LogInTest LogIn=new OrangeHRMApplication_LogInTest();
		LogIn.applicationLaunch();
		LogIn.logInTest();
		LogIn.logOutTest(); 
		LogIn.applicationClose();
		
		
		
		
		}
		

	}

