package dropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//handle multiple dropdown
		driver.navigate().to("http://demoapps.qspiders.com/");
		//identify dropdown
		WebElement dropdown4 = driver.findElement(By.id("idddd"));
		Select sel4 =new Select(dropdown4);
		sel4.selectByIndex(5);
		// select multiple option from multiple dropdown
		for(int i=0;i<=5;i++)
		{
			sel4.selectByIndex(i);
		}
		
		Thread.sleep(2000);
		driver.navigate().to("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("selection[text()='dropdown')")).click();
		driver.findElement(By.partialLinkText("Multi Select")).click();
		
		
		
		
		
		
		
		
		
	}

}
