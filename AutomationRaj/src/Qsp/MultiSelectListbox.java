package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListbox {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/rajha/OneDrive/Desktop/web%20energy/text/breakfast.html");
	WebElement mtrlistbox= driver.findElement(By.id("mtr"));
	Select s=new Select(mtrlistbox);
	s.selectByIndex(0);
	s.selectByValue("v");
	s.selectByVisibleText("dosa");
	s.deselectByVisibleText("idly");
	s.deselectByValue("d");
	s.deselectByIndex(2);
	System.out.println(s.isMultiple());
	driver.close();
}
}
