package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectReverse {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/rajha/OneDrive/Desktop/web%20energy/text/breakfast.html");
	WebElement mtrList = driver.findElement(By.id("mtr"));
	Select s=new Select(mtrList);
	List<WebElement> allopt = s.getOptions();
	int count=allopt.size();
	System.out.println("total "+count);
	for(int i=0;i<count;i++) {
		Thread.sleep(1000);
		s.selectByIndex(i);
	}
	for(int i=count-1;i>=0;i-- ) {
		Thread.sleep(1000);
		s.deselectByIndex(i);
	}
	driver.close();
}
}
