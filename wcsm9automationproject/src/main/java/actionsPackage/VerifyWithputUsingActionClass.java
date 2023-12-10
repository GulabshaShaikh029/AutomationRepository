package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyWithputUsingActionClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		// to hande a popup
		driver.findElement(By.id("denyBtn")).click();
		//click on the coins
		 WebElement coinsTarget = driver.findElement(By.xpath("//a[text()='Coins']"));
		// use actions class for mouseHover
		Actions act = new Actions(driver);
		act.moveToElement(coinsTarget).build().perform();
		Thread.sleep(2000);
		//click on coins by design
		driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
		Thread.sleep(2000);
		//verify laxmi gold coins text
		if(driver.findElement(By.xpath("//h1[text()='Lakshmigoldcoins']")).isDisplayed())
		{
			System.out.println("text Dispalyed!!");
	
		}
		else
		{
			System.out.println("text is not Dispalyed!!");
		}
	}

}

