package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	     boolean login = driver.findElement(By.id("keepLoggedInLabel")).isSelected();
	 	if(login)
			System.out.println("yes");
		else
			System.out.println("no");
		driver.close();
}
}