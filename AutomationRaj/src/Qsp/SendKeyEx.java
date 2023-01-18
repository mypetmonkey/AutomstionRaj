package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyEx {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
Thread.sleep(2000);
driver.findElement(By.xpath("//div[text()='Login ']")).click();
driver.close();
}
}