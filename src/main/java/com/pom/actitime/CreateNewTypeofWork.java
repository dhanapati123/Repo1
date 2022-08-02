package com.pom.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.generics.actitime.ExcelLibrary;

public class CreateNewTypeofWork 
{

	@FindBy(id="name")
    private WebElement nameTextfield;
    
    @FindBy(xpath="//select[@name='active']")
    private WebElement activeDropdown;
    
    @FindBy(xpath="//input[@type='submit']")
    private WebElement createtypeofworkLink;
    
    @FindBy(xpath="//input[@type='submit']")
    private WebElement createtypeofWorkButton;
    
    public CreateNewTypeofWork(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void CreateNewTypeofWorkMethod() throws IOException
    {
    	nameTextfield.sendKeys(ExcelLibrary.getcellvalue("LoginData",6,5));
    	Select sel=new Select(activeDropdown);
    	sel.selectByValue("false");
    	createtypeofWorkButton.click();
    	
    }
}
