package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnAlligned {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(1000);
       int y1= driver.findElement(By.xpath("//input[@value='1']")).getLocation().getY();
      int y2=  driver.findElement(By.xpath("//input[@value='2']")).getLocation().getY();
      int y3=  driver.findElement(By.xpath("//input[@value='-1']")).getLocation().getY();
      if(y1==y2 && y2==y3) 
    	  System.out.println(" yes equal & PASS");
      else
    	  System.out.println("not equal and fail");
     // Thread.sleep(2000);
      System.out.println(y1+" "+y2+" "+y3);
     driver.close();
}
}