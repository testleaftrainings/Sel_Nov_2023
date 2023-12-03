package week3.LearnAbstraction;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones", Keys.ENTER);

		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		System.out.println(price);

		List<Integer> pdtPrices = new ArrayList<Integer>();// empty list
		
		for (int i = 0; i < price.size(); i++) {
			String text = price.get(i).getText();
			// 500 10,999
			String replaceAll = text.replaceAll(",","");
			int number = Integer.parseInt(replaceAll);
			//List<Integer> pdtPrices = new ArrayList<Integer>();// empty list

			pdtPrices.add(number);
		}

		System.out.println(pdtPrices);

		Collections.sort(pdtPrices);

		System.out.println(pdtPrices);

		// to min value
		Integer min = Collections.min(pdtPrices);
		System.out.println(min);

	}

	// to print the lowset price

	// sort the list

	// to apply discount

}
