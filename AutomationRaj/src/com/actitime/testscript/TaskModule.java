package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class TaskModule extends BaseClass {
	@Test(priority=1)
	public void createTask() {
		Reporter.log("create Task",true);
	}
	@Test(priority=2)
	public void modifyTaskt() {
		Reporter.log("modify Task",true);
	}
	@Test(priority=3)
	public void deleteTask() {
		Reporter.log("delete Task",true);
	}

}
