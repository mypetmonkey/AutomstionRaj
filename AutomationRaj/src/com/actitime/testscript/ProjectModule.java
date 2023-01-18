package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class ProjectModule extends BaseClass {
	@Test(priority=1)
	public void createProject() {
		Reporter.log("create Project",true);
	}
	@Test(priority=2,dependsOnMethods = "createProject")
	public void modifyProject() {
		Reporter.log("modify Project",true);
	}
	@Test(priority=3,dependsOnMethods = {"createProject","modifyProject"})
	public void deleteProject() {
		Reporter.log("delete Project",true);
	}

}
