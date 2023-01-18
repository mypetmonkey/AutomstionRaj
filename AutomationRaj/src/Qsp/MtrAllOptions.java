package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrAllOptions {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
   public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/rajha/OneDrive/Desktop/web%20energy/text/breakfast.html");
	WebElement list = driver.findElement(By.id("mtr"));
	Select s=new Select(list);
	List<WebElement> all = s.getOptions();
	int count=all.size();
	System.out.println(count);
	for(int i=0;i<count;i++) {
		String text = all.get(i).getText();
		System.out.println(text);
	}
	
}
}
