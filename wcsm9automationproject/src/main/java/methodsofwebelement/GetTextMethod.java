package methodsofwebelement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("iphone");
		List<WebElement> allIphone = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		for(WebElement phone:allIphone)
		{
			System.out.println(phone.getText());
		}
	}

}
