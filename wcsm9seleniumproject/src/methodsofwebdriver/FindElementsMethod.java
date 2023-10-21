package methodsofwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//handle the properties of browser
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("bike");
		//identify all the suggestion of bike
		 List<WebElement> bikeOptions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		Thread.sleep(2000);
		//read all the suggestion of bike by using for loop
		Thread.sleep(2000);

		for( WebElement op:bikeOptions )
		{
			String options = op.getText();
			Thread.sleep(2000);
			System.out.println(options);
		}
	}

}
