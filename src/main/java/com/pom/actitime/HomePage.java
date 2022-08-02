package com.pom.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public WebDriver driver;
	
	@FindBy(id="container_tasks")
	private WebElement taskslink;
	
    @FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
    private WebElement popupmenuDropdown;
    
    @FindBy(xpath="//a[.='Types of Work']")
    private WebElement typeofWorklink;
    
    @FindBy(xpath="//a[.='Leave Types']")
    private WebElement leavetypeslink;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void tasksmethod()
	{
		taskslink.click();
	}
	
	public void popupmenuMethod()
	{
		popupmenuDropdown.click();
	}
	
	public void typeofWorkMethod()
	{
		typeofWorklink.click();
	}
	
	public void leavetypeslinkMethod()
	{
		leavetypeslink.click();
	}
	
	public void logoutMethod()
	{
		logoutLink.click();
	}
}
