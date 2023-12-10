package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnTOUseKeyboardActions {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));

		Actions ac=new Actions(driver);
		ac.keyDown(Keys.CONTROL).click(item1).click(item3)
		.keyUp(Keys.CONTROL)
		.perform();
		
		
		//Screenshot 2 ways-Complete webpage/ele alone
		
		File scource = driver.getScreenshotAs(OutputType.FILE);
		File destn=new File("./snap/pic.png");//setting the filepath
		FileUtils.copyFile(scource, destn);
		//refresh the project to see the folder in the project
		//elescreenshot
		File src = item1.getScreenshotAs(OutputType.FILE);
		File des=new File("./snap/pic1.png");//setting the filepath
		FileUtils.copyFile(src, des);
		
		
		
		

	}

}
