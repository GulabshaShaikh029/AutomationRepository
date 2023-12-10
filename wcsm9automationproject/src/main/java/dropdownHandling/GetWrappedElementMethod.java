package dropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/DELL/Desktop/wcsm9webelements/SingleSelectDropdown.html");
		//identify single select dropdown
		WebElement dropDown1 = driver.findElement(By.xpath("//select[@id='idddd']"));
		Thread.sleep(2000);
		// handle the dropdown
		Select sel1 = new Select(dropDown1);
		Thread.sleep(2000);
		//get all the options from dropdown by using get operation method
		List<WebElement> allops1 = sel1.getOptions();
		// select the option from dropdown
		for(WebElement op:allops1)
		{
			String selop = op.getText();
			Thread.sleep(2000);
			System.out.println(selop);
			
		}
		
		
	}
}