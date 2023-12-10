package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		System.out.println(driver);
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
		driver.findElement(By.xpath("//span[text()='Open']")).click();	
		
		String windowHandle = driver.getWindowHandle();//current(Parent) address of the webPage/tab/window
		//System.out.println(windowHandle);
		
		//to get the address all the windows or tabs opened 
		Set<String> windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) {
			System.out.println(handle);
			
		}		
		
		System.out.println("Before switch :" +driver.getTitle());
		//stpe:1 getting the number of windows address -->set
		//step:2 convert into list
		List<String> winHan=new ArrayList<String>(windowHandles);
		//step:3 driver focus to the targeted window
	//	driver.switchTo().window(winHan.get(0)); //0 index -->parent window
		driver.switchTo().window(winHan.get(1));
		
		System.out.println("After Switching " +driver.getTitle());
		
		driver.switchTo().window(winHan.get(0));		
		
		System.out.println("Parent Window " +driver.getTitle());

		driver.close(); //closing the browser where the driver control is active
		
		//close the child window without closing the parent
		
	  //	System.out.println(driver.getWindowHandle());
		
		driver.switchTo().window(winHan.get(1));
		driver.close();
		
		//driver.quit();// closes all the windows/tab
		
	}

}
