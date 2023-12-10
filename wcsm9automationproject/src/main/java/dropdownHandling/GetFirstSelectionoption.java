package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectionoption {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/DELL/Desktop/wcsm9webelements/SingleSelectDropdown.html");
		WebElement dropDown1 = driver.findElement(By.xpath("//select[@id='idddd']"));
		// hamdle the dropdown
		Select sel1 = new Select(dropDown1);
		Thread.sleep(2000);
		//select the option from single dropdown
		sel1.selectByValue("v7");
		Thread.sleep(2000);
		//get the option which is selected first
		WebElement firstopt = sel1.getFirstSelectedOption();
		//get the firstopt 
		System.out.println(firstopt.getText());
		Thread.sleep(2000);
		// for multiple select dropdown
		driver.navigate().to("file:///C:/Users/DELL/Desktop/wcsm9webelements/MultipleSelectDropdown.html");
		//identify single select dropdown
		Thread.sleep(2000);
		WebElement dropDown2 = driver.findElement(By.xpath("//select[@id='idddd']"));
		//handle the dropdown
		Select sel2 = new Select(dropDown2);
		//select the option from single dropdown
		for(int i=5;i<8;i++)
		{
			Thread.sleep(2000);
			sel2.selectByIndex(i);
			
		}
		
		//get the option which is selected first 
		//firstopt=sel1.getFirstSelectedOption();
		//get the first Opt
		System.out.println(sel2.getFirstSelectedOption().getText());
		
			
		
	}

}
