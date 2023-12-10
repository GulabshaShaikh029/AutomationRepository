package synchronizationPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartEndToEndFlow { 
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("//www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='X']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[contains(@title,'search')]")).click();
		//get the address of parent window
		String parentHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[@class='_4rR01T'][2]")).click();
		//get the address of all the windows
		Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles)
		{
		  if(!parentHandle.equals(wh))
		  {
			driver.switchTo().window(wh);
		  }
		}
		driver.findElement(By.xpath("//div[@class='_30ikkn_3_ezix_2KarXJ' and (text()=")).click();
		driver.findElement(By.partialLinkText("250 GB")).click();
		driver.findElement(By.id("pincodeInputId")).click();
		driver.findElement(By.id("pincodeInputId")).sendKeys("411027");
		driver.findElement(By.xpath("//span[text()='check']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ61_2U9uOA_')]")).click();
		WebElement removeButton=driver.findElement(By.xpath("//div[text()='Remove']"));
		Point loc= removeButton.getLocation();
		int xaxis= loc.getX();
		int yaxis= loc.getY();
	
	
	}
}
