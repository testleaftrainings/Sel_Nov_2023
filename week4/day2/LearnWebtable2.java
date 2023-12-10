package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtable2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Locate the table

		WebElement table = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody"));

		List<WebElement> row = table.findElements(By.tagName("tr"));
		System.out.println(row.size());
		// find the colcount
		List<WebElement> col = row.get(1).findElements(By.tagName("td"));
		System.out.println(col.size());

		System.out.println("One Column Data");
		for (int i = 1; i < row.size(); i++) {

			WebElement onecolData = driver.findElement(
					By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[" + i + "]/td[2]"));

			System.out.println(onecolData.getText());
		}

		System.out.println("***************************************");

		System.out.println("One Row Data");
		for (int i = 1; i < col.size(); i++) {

			WebElement onerowData = driver.findElement(
					By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[3]/td[" + i + "]"));

			System.out.println(onerowData.getText());
		}

		System.out.println("***************************************");

		System.out.println("One Row Data");
		for (int i = 1; i < col.size(); i++) {

			WebElement onerowData = driver.findElement(
					By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[3]/td[" + i + "]"));

			System.out.println(onerowData.getText());
		}

		System.out.println("***************************************");

		System.out.println("All Row Data");
		
		for(int i=1;i<row.size();i++) {//iterates through row -tr
		for (int j = 1; j < col.size(); j++) {//iterate thro the col td
			WebElement allrowData = driver.findElement(
					By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td[" + j + "]"));
			System.out.print(allrowData.getText()+" ");
		}
		System.out.println();
	}

	}}
