package takesScreenShot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledWebElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		//click on disabled mode
		driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
		// explicit type casting into java script execute
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//handle  disable name text box
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('name').value='gulabsha'");
		// explicit type casting into java script executer
		JavascriptExecutor jse1=(JavascriptExecutor)driver;
		//handle  disable email text box
		jse1.executeScript("document.getElementById('email').value='gulabsha123@gmail.com'");
		//handle  disable password text box
		JavascriptExecutor jse2=(JavascriptExecutor)driver;
		jse2.executeScript("document.getElementById('password').value='gulabsha123'");
		//click o register disable button
		WebElement disableRegisterButton = driver.findElement(By.xpath("//button[text()='Register']"));
		
		if(disableRegisterButton.isDisplayed())
		{
			jse.executeScript("argument[0].click()",disableRegisterButton);
			Thread.sleep(2000);
			jse.executeScript("argument[0].click()",driver.findElement(By.xpath("//a[contains(@class,'bg-orange-500')]")));
			System.out.println("click");
		}
		else
		{
			System.out.println(" Not click");
		}
		
		
		
	}

}
