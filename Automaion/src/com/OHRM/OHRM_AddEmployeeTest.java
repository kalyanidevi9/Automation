package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OHRM_AddEmployeeTest {
	
	static WebDriver driver;
	private Object single;
	
	public void applicationLaunch()
	{
		driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(applicationUrlAddress);
		
	}
	public void logInTest()
	{
		String userNameTestData="Admin";
		By userNameProperty=By.id("txtUsername");
		
	WebElement userName=driver.findElement(userNameProperty);
	userName.sendKeys(userNameTestData);
	
	String passwordNameTestData="Livetech@123";
	By passwordNameProperty=By.name("txtPassword");
	
	WebElement passwordName=driver.findElement(passwordNameProperty);
	passwordName.sendKeys(passwordNameTestData);
	
	By logInButtonProperty=By.className("button");
    WebElement logInButton=driver.findElement(logInButtonProperty);
    logInButton.click();
	
	}
	public void pimTest()
	{
		By pimProperty=By.id("menu_pim_viewPimModule");
		WebElement pim=driver.findElement(pimProperty);
		
		Actions pimAction=new Actions(driver);
		pimAction.moveToElement(pim).build().perform();
		}
	public void pimAddEmployeeTest()
	{
		By pimAddEmployeeProperty=By.id("menu_pim_addEmployee");
		WebElement pimAddEmployee=driver.findElement(pimAddEmployeeProperty);
		pimAddEmployee.click();
	}
	public void addNewEmployee() throws InterruptedException
	{
		String firstNameTestData="kalyani17";
		//id="firstName"
		By firstNameProperty=By.id("firstName");
		WebElement firstName=driver.findElement(firstNameProperty);
		firstName.sendKeys(firstNameTestData);
		
		String middlenameTestData="Devi123";
		//id="middleName"
		
		By middleNameProperty=By.id("middleName");
		WebElement middleName=driver.findElement(middleNameProperty);
		middleName.sendKeys(middlenameTestData);
		
		String lastNameTestData="1117";
		//id="lastName"
		
		By lastNameProperty=By.id("lastName");
		WebElement lastName=driver.findElement(lastNameProperty);
		lastName.sendKeys(lastNameTestData);
		
		//id="employeeId"
		By employeeIdProperty=By.id("employeeId");
		WebElement employeeId=driver.findElement(employeeIdProperty);
		 String expected_Employeeld=employeeId.getAttribute("value");
		 System.out.println("The EmployeeId is:-"+expected_Employeeld);
		
		Thread.sleep(1000); 
		
		// id="btnSave"
		By saveButtonProperty=By.id("btnSave");
		WebElement saveButton=driver.findElement(saveButtonProperty);
		saveButton.click();
		
		driver.findElement(By.id("btnSave")).click();
		
		//id="personal_optGender_2"
		By FemaleProperty=By.id("personal_optGender_2");
		WebElement Female=driver.findElement(FemaleProperty);
		Female.click();
		
		WebElement g=driver.findElement(By.id("personal_cmbMarital"));
	    Select se=new Select(g);
	    se.selectByIndex(1);
		driver.close();
	
	}
		
		
		
	
	public static void main(String[] args) throws InterruptedException {
		OHRM_AddEmployeeTest addEmployeeTest=new OHRM_AddEmployeeTest();
		addEmployeeTest.applicationLaunch();
		addEmployeeTest.logInTest();
		addEmployeeTest.pimTest();
		addEmployeeTest.pimAddEmployeeTest();
		addEmployeeTest.addNewEmployee();
		//driver.close();
		
	}

}
