package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleListBox {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Create New Account")).click();
	Thread.sleep(2000);
	WebElement lbm = driver.findElement(By.id("month"));
	Select s=new Select(lbm);
	s.selectByIndex(0);
	s.selectByValue("3");
	s.selectByVisibleText("May");
driver.close();	
}

}
