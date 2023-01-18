package Qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upcasting {
    static void test(WebDriver driver) {
    	driver.get("https://google.com");
    	String title=driver.getTitle();
    	System.out.println(title);
    	driver.close();    	
    	}
}
class Executer{
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Upcasting.test(driver);
		WebDriver driver2=new FirefoxDriver();
		Upcasting.test(driver2);
	}
}