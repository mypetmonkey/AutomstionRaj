package Qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadNaukri {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("rajhansmehta1@gmail.com");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("Rajhans@123");
		driver.findElement(By.xpath("(//button)[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__bars']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("View & Update Profile")).click();
		Thread.sleep(2000);
		File f=new File("C:\\Users\\rajha\\OneDrive\\Documents\\Rajans resum.pdf");
		String path=f.getAbsolutePath();
		Thread.sleep(3000);
		driver.findElement(By.id("attachCV")).sendKeys(path);
		//driver.close();
	}

}
