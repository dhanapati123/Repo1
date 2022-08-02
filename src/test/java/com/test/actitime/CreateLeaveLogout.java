package com.test.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.BaseTest;
import com.pom.actitime.CreateNewLeaveType;
import com.pom.actitime.HomePage;
import com.pom.actitime.LeaveTypesPage;



public class CreateLeaveLogout extends BaseTest
{
  @Test
  public void createleavetype() throws IOException, InterruptedException
  {
	  HomePage home=new HomePage(driver);
		home.popupmenuMethod();
		home.leavetypeslinkMethod();
		Thread.sleep(3000);
		
		LeaveTypesPage leavetype=new LeaveTypesPage(driver);
		leavetype.createleavetypeMethod();
		Thread.sleep(3000);
		
		CreateNewLeaveType leave=new CreateNewLeaveType(driver);
		leave.CreateNewLeaveTypeMethod();
		Thread.sleep(3000);
  }
}
