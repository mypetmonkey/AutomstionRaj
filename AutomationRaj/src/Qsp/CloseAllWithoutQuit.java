package Qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllWithoutQuit {
	static {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	}
    public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://in.indeed.com/");
		driver.findElement(By.linkText("Sign in")).click();
    	driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
    	driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
    	Set<String> all = driver.getWindowHandles();
    	for(String opt:all) {
    		driver.switchTo().window(opt);
    		Thread.sleep(2000);
    		driver.close();
    	}
    	
	}
}
