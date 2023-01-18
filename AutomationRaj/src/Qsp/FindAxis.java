package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAxis {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 int xaxis= driver.findElement(By.xpath("//button[@name='login']")).getLocation().getX();
		 int yaxis = driver.findElement(By.xpath("//button[@name='login']")).getLocation().getY();
		 System.out.println("x axis is ="+xaxis+" y axis is ="+yaxis);
		 driver.quit();
}
}
