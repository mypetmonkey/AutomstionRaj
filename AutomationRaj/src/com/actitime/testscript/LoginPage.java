package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement untbx;
	@FindBy (name="pwd")
   private WebElement pwtbx;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtn;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void setLogin(String un,String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgbtn.click();
	}
}
class MainMethodcls{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		LoginPage lp=new LoginPage(driver);
		lp.setLogin("admin","manager");
		
	}
}