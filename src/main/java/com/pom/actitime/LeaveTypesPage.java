package com.pom.actitime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeaveTypesPage 
{
	WebDriver driver;
	 @FindBy(xpath="//span[.='Create Leave Type']")
	 private WebElement createleavetypelink;
	 
	 @FindBy(xpath="(//div[@class='leaveTypeNameText'])[7]")
	 private WebElement leavenameTextfield;
	 
	 @FindBy(xpath="(//div[@class='leaveTypeNameText'])[7]/../../.././../..//td[@class='leaveTypeDeleteCell last']")
	 private WebElement selectButton;
	 
	 public LeaveTypesPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
		 this.driver=driver;
	 }
	 
	 public void createleavetypeMethod()
	 {
		 createleavetypelink.click(); 
	 }
	 
	 public void selectMethod() 
	 {
		 selectButton.click();
	 }
	 
	 public void leavenameMethod() 
	 {
		 leavenameTextfield.click();
		 leavenameTextfield.clear();
		 leavenameTextfield.sendKeys("ronaldo");
	 }
	 
	 public void handlepopupMethod()
	   {
		   Alert alt=driver.switchTo().alert();
		   alt.accept();
	   }
	 
}
