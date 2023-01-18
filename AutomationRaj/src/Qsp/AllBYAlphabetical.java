package Qsp;

import java.util.*;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllBYAlphabetical {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/rajha/OneDrive/Desktop/web%20energy/text/breakfast.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
 		Select s=new Select(mtrlistbox);
		List<WebElement> allopt =s.getOptions();
		int count=allopt.size();
		System.out.println(count);
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<count;i++) {
			String text=allopt.get(i).getText();
			al.add(text);
		}
		Collections.sort(al);
		//System.out.println(al);
		System.out.println("alphabetical sorting-------------------");
		for(String all:al) {
			System.out.println(all);
		}
		driver.close();
}
}
