package week3.LearnAbstraction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) {
		
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	 System.out.println(allLinks.size());
	 allLinks.get(3).click();
	 
	}
}
