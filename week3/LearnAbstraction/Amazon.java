package week3.LearnAbstraction;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones", Keys.ENTER);
		
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		System.out.println(price);
		
		List<String> pdtPrices=new ArrayList<String>();//empty list
		for (int i = 0; i < price.size(); i++) {
			//System.out.println(price.get(i).getText());
			
			pdtPrices.add(price.get(i).getText());
		}
		
		System.out.println(pdtPrices);
		
	}

}
