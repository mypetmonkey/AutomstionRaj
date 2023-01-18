package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugessation {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(4000);
		List<WebElement> all = driver.findElements(By.xpath("//span[text()='java']"));
	   int count=all.size();
	   System.out.println(count);
	   for(int i=0;i<count;i++) {
		   String text=all.get(i).getText();
		   System.out.println(text);
	   }
	   all.get(0).click();
	   driver.close();
	
	}

}
