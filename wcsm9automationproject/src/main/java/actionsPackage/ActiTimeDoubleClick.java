package actionsPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiTimeDoubleClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-ro120cu/login.do");
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		//get the address of parent window
		String parentHandle = driver.getWindowHandle();
		//get the address of all window
		Set<String> allHandles = driver.getWindowHandles();
		//switch control from parent to child window
		 Thread.sleep(2000);
		for(String wh:allHandles)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);
			}
		}

		//click on setting)
	    driver.findElement(By.xpath("//body[@class='  ext-chrome']")).click();
	    Thread.sleep(2000);

	}

}
