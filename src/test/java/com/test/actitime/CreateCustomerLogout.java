package com.test.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.BaseTest;
import com.pom.actitime.CreateNewCustomer;
import com.pom.actitime.HomePage;
import com.pom.actitime.TasksPage;



public class CreateCustomerLogout extends BaseTest
{
   @Test
   public void customer() throws InterruptedException, IOException 
   {
	   HomePage home=new HomePage(driver);
		home.tasksmethod();
		
		TasksPage task=new TasksPage(driver);
		task.TasksPageMethod();;
		
		CreateNewCustomer customer=new CreateNewCustomer(driver);
		customer.CreateNewCustomerMethod();
   }
}
