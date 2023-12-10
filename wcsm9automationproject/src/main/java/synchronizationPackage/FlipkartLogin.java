package synchronizationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//hande a popup window
		driver.findElement(By.xpath("/span[contains(@role,'button')]")).click();
		Thread.sleep(2000);
		//click on cart
		driver.findElement(By.xpath("//img[@class='_1XmrCc_1FTDbN' and (@width='24')]")).click();
		Thread.sleep(2000);
		//click on login button
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}

}
