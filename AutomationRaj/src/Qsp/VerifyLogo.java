package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	   boolean logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
	   if(logo)
		   System.out.println("displayed & pass");
	   else
		   System.out.println(" not displayed & fail");
	   driver.close();
	
}
}
