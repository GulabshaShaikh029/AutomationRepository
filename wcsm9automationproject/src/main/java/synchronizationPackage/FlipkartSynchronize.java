package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSynchronize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		//handle a popup
		driver.findElement(By.xpath("//span[text()='X']")).click();
		//click on cart
		driver.findElement(By.xpath("//a[@class='_krdK5' and (@title='cart')]")).click();
		Thread.sleep(2000);
		// click on Login button
		driver.findElement(By.xpath("//span[text='Login')]")).click();
		//driver.quit();
		
	
	}
}
