package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitwithVisibility {

	public static void main(String[] args) {

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");		
		ChromeDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/waits.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//method1
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		
		//method2
		wait.until(ExpectedConditions.textToBe(By.xpath("//span[text()='I am here']"),"I am here"));
		
		String iAmHere = driver.findElement(By.xpath("//span[text()='I am here']")).getText();
		System.out.println(iAmHere);
		
	}

}
