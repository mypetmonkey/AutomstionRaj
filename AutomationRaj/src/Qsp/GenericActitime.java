package Qsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generics.FileLibrary;

public class GenericActitime {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		FileLibrary f=new FileLibrary();
		driver.get(f.getPropertyData("url"));
		driver.findElement(By.id("username")).sendKeys(f.getPropertyData("username"));
		driver.findElement(By.name("pwd")).sendKeys(f.getPropertyData("password"));
		driver.findElement(By.id("loginButton")).click();
		
	}

}
