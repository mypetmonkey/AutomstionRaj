package Qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/rajha/OneDrive/Desktop/web%20energy/practice/cv.html");
	File f=new File("C:\\Users\\rajha\\OneDrive\\Desktop\\resume.docx");
	String path=f.getAbsolutePath();
	Thread.sleep(3000);
	driver.findElement(By.id("cv")).sendKeys(path);
}
}
