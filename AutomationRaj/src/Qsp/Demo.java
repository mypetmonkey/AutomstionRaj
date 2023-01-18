package Qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.instagram.com");
		String title=cd.getTitle();
		System.out.println(title);
		cd.close();
		
	}

}
