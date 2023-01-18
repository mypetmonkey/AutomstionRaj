package com.actitime.generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebElement untbx;  //declaration
	private WebElement pwtbx;
	private WebElement lgbtn;
	public LoginPage(WebDriver driver) {
		untbx=driver.findElement(By.id("username"));  //initialization
		pwtbx=driver.findElement(By.name("pwd"));
		lgbtn=driver.findElement(By.id("loginButton"));
	}
	
	public void setUser(String un,String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgbtn.click();
		
	}
}
