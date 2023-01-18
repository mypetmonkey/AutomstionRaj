package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.name("q")).sendKeys("iphone");
		 Thread.sleep(5000);
		List<WebElement> allsug = driver.findElements(By.xpath("//span[text()='iphone']"));
		 int count=allsug.size();
		 System.out.println(count);
		 for(int i=0;i<count;i++) {
			 String text = allsug.get(i).getText();
			 System.out.println(text);
		 }
		 driver.close();
	}

}
