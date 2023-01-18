package Qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.get("https://secure.indeed.com/");	
	    Thread.sleep(3000);
	  //  driver.findElement(By.xpath("(//a)[8]")).click();
	  //  Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
	    driver.findElement(By.id("login-facebook-button")).click();
	    Set<String> allwh = driver.getWindowHandles();
	    int count=allwh.size();
	    System.out.println(count);
	    for(String wh:allwh) {
	    	System.out.println(wh);
	    }
	    driver.quit();
	}

}
