package com.pom.actitime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypesOfWork 
{
	 WebDriver driver;
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement createtypeofWorklink;
	
	@FindBy(xpath="//a[.='mohanty']")
	private WebElement worknameButton;
	
	@FindBy(xpath="//a[.='mohanty']/../..//td[@class='listtblcell lastInRow']")
	private WebElement deleteButton; 
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelButton;
	
	public TypesOfWork(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void createtypeofWorkMethod()
	{
		createtypeofWorklink.click();
	}
	
	public void  worknameMethod()
	{
		worknameButton.click();;
	}
	
	public void deleteMethod()
	{
		deleteButton.click();
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
