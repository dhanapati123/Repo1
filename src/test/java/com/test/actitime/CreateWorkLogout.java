package com.test.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.generics.actitime.BaseTest;
import com.pom.actitime.CreateNewTypeofWork;
import com.pom.actitime.HomePage;
import com.pom.actitime.TypesOfWork;


public class CreateWorkLogout extends BaseTest
{
	public WebDriver driver;
	@Test
	 public void createtypeofwork() throws IOException
	 {
		    HomePage home=new HomePage(driver);
			home.popupmenuMethod();
			home.typeofWorkMethod();
			
			TypesOfWork type=new TypesOfWork(driver);
			type.createtypeofWorkMethod();
			
			CreateNewTypeofWork createnew=new CreateNewTypeofWork(driver);
			createnew.CreateNewTypeofWorkMethod();
     }
}