package Qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html ");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Alert a = driver.switchTo().alert();
	a.dismiss();
	

}
}