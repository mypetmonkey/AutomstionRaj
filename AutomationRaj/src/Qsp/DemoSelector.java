package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSelector {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
   public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
	   driver.get("file:///C:/Users/rajha/OneDrive/Desktop/web%20energy/Demo.html");
	   driver.findElement(By.cssSelector("a[id='d1']")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("a[name='n1']")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("a[class='c1']")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("a[href='https://www.jspiders.com/']")).click();
}
}
