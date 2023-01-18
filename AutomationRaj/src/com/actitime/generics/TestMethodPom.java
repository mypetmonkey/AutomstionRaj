package com.actitime.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestMethodPom {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
     @Test
     public void verifyLogin() throws InterruptedException {
    	 WebDriver driver=new ChromeDriver();  
    	 driver.get("https://demo.actitime.com");
    	 LoginPagePom lp=new LoginPagePom();
    	 PageFactory.initElements(driver,lp);
    	 lp.setLogin("admin1","manager1");
    	 Thread.sleep(5000);
    	 lp.setLogin("admin","manager");
    	 
     }
}
