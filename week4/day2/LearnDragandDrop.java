package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragandDrop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement drag = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
		Point location = drag.getLocation();
		int x = location.x;

		Actions ac = new Actions(driver);
		ac.dragAndDropBy(drag, x + 100, 0).perform();

		WebElement dragEle = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		
		WebElement drophere = driver.findElement(By.xpath("//span[text()='Droppable Target']"));
	
		
		ac.dragAndDrop(dragEle, drophere).perform();
		ac.doubleClick(drophere).perform();
		ac.contextClick(dragEle).perform();
	
	}

}
