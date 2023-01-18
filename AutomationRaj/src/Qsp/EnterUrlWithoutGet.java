package Qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class EnterUrlWithoutGet {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe")	;	
		}
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.google.com");
		Thread.sleep(3000);
		cd.navigate().to("https://instagram.com");
		Thread.sleep(8000);
		cd.navigate().back();
		Thread.sleep(3000);
		cd.navigate().forward();
		Thread.sleep(1000);
		cd.navigate().refresh();
		cd.close();		
		}

}
