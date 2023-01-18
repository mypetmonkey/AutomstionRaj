package Qsp;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlyDuplicateInList {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/rajha/OneDrive/Desktop/web%20energy/text/breakfast.html");
		WebElement mtrlist = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlist);
		List<WebElement> allopt = s.getOptions();
		int count=allopt.size();
		//System.out.println(count);
		System.out.println("duplicated items are ");
		ArrayList<String> l=new ArrayList<String>();
		for(int i=0;i<count;i++) {
			String text=allopt.get(i).getText();
			l.add(text);
			
			}
		HashSet<String> set=new HashSet<String>();
		for(String print:l) {
			if(set.add(print)==false)
				System.out.println(print);
		}
		driver.close();
		}
		
	}


