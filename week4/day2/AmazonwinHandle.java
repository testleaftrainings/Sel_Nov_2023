package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonwinHandle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones", Keys.ENTER);

		driver.findElement(By.xpath("//span[@class='a-price-whole']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		
		List<String> handle=new ArrayList<String>(windowHandles);
		driver.switchTo().window(handle.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(handle.get(0));
		driver.close();

		
		
		
		
	}

	
}
