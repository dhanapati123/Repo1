package com.pom.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage 
{
	@FindBy(xpath="//div[@class='addNewButton']")
	private WebElement addnewdropdown;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newcustomerlink;
	
	public TasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void TasksPageMethod()
	{
		addnewdropdown.click();
		newcustomerlink.click();
	}
}
