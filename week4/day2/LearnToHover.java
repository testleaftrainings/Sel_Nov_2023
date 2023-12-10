package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnToHover {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement men = driver.findElement(By.xpath("//a[@title='MEN']"));
		
		//instantiate the Actions class
		Actions act=new Actions(driver);		
		act.moveToElement(men).perform();
		
		WebElement home = driver.findElement(By.xpath("//a[@title='Home']"));
		
		//act.scrollToElement(home).click().perform();
		
		act.scrollByAmount(0, 700).perform();

	}

}
