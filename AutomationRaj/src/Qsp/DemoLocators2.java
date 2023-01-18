package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/rajha/OneDrive/Desktop/web%20energy/Demo.html");
	Thread.sleep(1000);
	driver.findElement(By.tagName("a")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.id("d1")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	driver.findElement(By.name("n1")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	driver.findElement(By.className("c1")).click();
	
}
}
