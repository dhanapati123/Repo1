package com.pom.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.ExcelLibrary;

public class CreateNewLeaveType 
{
   @FindBy(xpath="//input[@placeholder='Leave Type Name']")
   private WebElement leavetypenameTextfield;
   
   @FindBy(xpath="//span[@class='buttonTitle']")
   private WebElement createleavetypeButton;
   
   public CreateNewLeaveType(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
   
   public void CreateNewLeaveTypeMethod() throws IOException
   {
	   leavetypenameTextfield.sendKeys(ExcelLibrary.getcellvalue("LoginData",2,8)); 
   	   createleavetypeButton.click();
   }
}
