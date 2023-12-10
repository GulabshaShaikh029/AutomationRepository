package dropdownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/DELL/Desktop/wcsm9webelements/SingleSelectDropdown.html");
		//identify dropdown and store it in ref variable
		WebElement menuDropDown = driver.findElement(By.id("idddd"));
		// get all the options of menuDropDown
		Select sel = new Select(menuDropDown );
		List<WebElement> allops
		= sel.getOptions();
		// to eliminate duplicates we use hashset
		HashSet<String> hs = new HashSet<String>();
		//read the list by using for loop and eliminate duplicate
		for(int i=0;i<allops.size();i++)
		{
			WebElement op = allops.get(i);
			//get the text of webElement
			String dropDownOption = op.getText();
			System.out.println(dropDownOption);
			Thread.sleep(2000);
			// all the dropDownOption into Hashset and remove duplicate from dropDown
			hs.add(dropDownOption);
			
		}
		Thread.sleep(2000);
		//read the option from Hashset by using for each loop 
		for(String opt:hs)
		{
			Thread.sleep(2000);
			System.out.println(opt);
			
		}

}
}