package Qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GivenFormat {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 14");
		driver.findElement(By.xpath("(//button)[1]")).click();
		List<WebElement> mobile = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 ')]"));
		 List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 ')]/../../div[2]/div/div/div"));
		int count=mobile.size();
		for(int i=0;i<count;i++) {
			String m = mobile.get(i).getText();
			String p=price.get(i).getText();
		
		System.out.println("mobile name "+m+"======>>>> "+" price is "+p);
		}	
		driver.close();
	}

}
