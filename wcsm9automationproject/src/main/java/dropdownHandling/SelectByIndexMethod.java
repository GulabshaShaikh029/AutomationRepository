package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/");
		// identify dropdown and click
		driver.findElement(By.xpath("//section[text()='Dropdown']"));
		//identify phone no. dropdown
		WebElement dropDown1 = driver.findElement(By.xpath("//select[contains(@class,'transition-all duration-150w-5/1']"));
		Select sel1 = new Select(dropDown1);
		Thread.sleep(2000);
		//select the option
		sel1.selectByIndex(2);
		Thread.sleep(2000);
		//identify country dropdown
		WebElement dropDown2 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::Select"));
		Select sel2 = new Select(dropDown2);
		sel2.selectByValue("India");
		WebElement dropDown3 = driver.findElement(By.xpath("//label[text()='state']/following-sibling::/select"));
		Select sel3 = new Select(dropDown3);
		Thread.sleep(2000);
		sel3.selectByVisibleText("Maharashtra");
		
		
		
		
	}

}
