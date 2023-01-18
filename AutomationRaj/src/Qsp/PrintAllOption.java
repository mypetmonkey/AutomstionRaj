 package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOption {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/rajha/OneDrive/Desktop/web%20energy/text/breakfast.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> allopt = s.getOptions();
		int c=allopt.size();
		System.out.println(c);
		for(int i=0;i<c;i++) {
			String text=allopt.get(i).getText();
			System.out.println(text);
		}
driver.close();
}
}