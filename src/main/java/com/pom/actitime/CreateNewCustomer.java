package com.pom.actitime;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.ExcelLibrary;

public class CreateNewCustomer 
{
	WebDriver driver;
	
   @FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
   private WebElement entercustomernameTextfield;
   
   @FindBy(xpath="//div[@class='components_button withPlusIcon']")
   private WebElement createcustomerButton;
   
   @FindBy(xpath="//div[@class='greyButton cancelBtn']")
   private WebElement cancelButton;
   
   public CreateNewCustomer(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
	   this.driver=driver;
   }
   
   public void CreateNewCustomerMethod() throws InterruptedException, IOException
   {
	   entercustomernameTextfield.sendKeys(ExcelLibrary.getcellvalue("LoginData",1,3));
	   Thread.sleep(3000);
	   createcustomerButton.click();
	   Thread.sleep(3000);
   }
   
   public void cancelMethod() throws InterruptedException
   {
	   cancelButton.click();  
	   Thread.sleep(3000);
   }
   
   public void handlepopupMethod()
   {
	   Alert alt=driver.switchTo().alert();
	   alt.accept();
   }
}
