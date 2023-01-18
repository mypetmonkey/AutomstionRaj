package Qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {
	//AMAZON Example
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
   public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
	List<WebElement> all = driver.findElements(By.xpath("//div[contains(text(),'shoes')]"));
	 int count=all.size();
	 System.out.println(count);
	 for(int i=0;i<count;i++) {
		 String text = all.get(i).getText();
		 System.out.println(text);
	 }
	 all.get(0).click();
	
}
}
 