package Qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
   WebDriver driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   driver.get("https://demo.actitime.com/");	
   driver.findElement(By.id("username")).sendKeys("admin");
   driver.findElement(By.name("pwd")).sendKeys("manager");
   driver.findElement(By.id("loginButton")).click();
   driver.findElement(By.partialLinkText("Logout")).click();
   driver.close();    

}
}
