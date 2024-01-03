package com.OHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest{
	
	FileInputStream testDataFile;
	XSSFWorkbook workBook;
	XSSFSheet testDataSheet;
	Row testDataRow;
	
	FileInputStream PropertiesFile;
	Properties properties;
	private Object userName;
	private String expeted_OrangeHRMApplicationHomePageText;
	
	@Test(priority=1,description="Validating LogIn Functionality Test")
	public void logInTest() throws IOException
	{
	testDataFile=new FileInputStream("C:\\Users\\Hp\\Desktop\\Kalayani\\Automaion\\Resources\\Book3.xlsx");
	workBook=new XSSFWorkbook(testDataFile);
	testDataSheet=workBook.getSheet("Sheet2");
	
	PropertiesFile=new FileInputStream("C:\\Users\\Hp\\Desktop\\Kalayani\\Automaion\\src\\com\\utility\\OrangeHRM.Properties");
	properties=new Properties();
	properties.load(PropertiesFile);
	
	testDataRow=testDataSheet.getRow(1);
	Cell userNametestDataRowofCell=testDataRow.getCell(0);
    String userNameTestData=userNametestDataRowofCell.getStringCellValue();
    
  By userNameProperty=By.id(properties.getProperty("orangeHRMAplicationLogInPageUserNameProperty"));
  WebElement userName=driver.findElement(userNameProperty);
  userName.sendKeys(userNameTestData);
  
  
 Cell PasswordTestDataCell=testDataRow.getCell(3);
 String PasswordTestData=PasswordTestDataCell.getStringCellValue();
 By Passwordproperty=By.name(properties.getProperty("orangeHRMAplicationLogInPagePasswordProperty"));
 WebElement Password=driver.findElement(Passwordproperty);
 Password.sendKeys(PasswordTestData);
 
By logInButtonProperty=By.className(properties.getProperty("orangeHRMAplicationLogInPageLogInButtonProperty"));
WebElement LogInButton=driver.findElement(logInButtonProperty);
LogInButton.click();
    
	}
@Test(priority=2,description="Validating LogOut functionality test")	
public void logOutTest()
{
	//id="welcome"
	By welcomeAdminProperty=By.id(properties.getProperty("orangeHRMAplicationHomePageWelComeAdminProperty"));
	WebElement welcomeAdmin=driver.findElement(welcomeAdminProperty);
	
String expected_OrangeHRMApplicationHomePageText="welcomeAdmin";	
System.out.println("The Expeted Text of OrangeHRMApplicationHomePage is:-"+expeted_OrangeHRMApplicationHomePageText);

String actual_OrangeHRMApplicationHomePageText="welcomeAdmin.getText()";	
System.out.println("The actual_OrangeHRMApplicationHomePage is:-"+actual_OrangeHRMApplicationHomePageText);

if(actual_OrangeHRMApplicationHomePageText.equals(expected_OrangeHRMApplicationHomePageText))
{
	System.out.println("successfully Navigate to OrangeHRM Application Homepage-pass");
	Cell TestResultCell=testDataRow.createCell(2);
    TestResultCell.setCellValue("Successfully  Navigated to OrangeHRM Application HomePage - PASS");

	
}


	
	
			
}
	
	
	
	

}
