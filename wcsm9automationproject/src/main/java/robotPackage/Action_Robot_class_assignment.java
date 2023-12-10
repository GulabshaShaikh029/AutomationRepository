package robotPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Robot_class_assignment {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		//mouse hover watch jwellary
		WebElement watchJwellary = driver.findElement(By.xpath("//a[@title='Watch Jewellery']"));
		Actions act  = new Actions(driver);
		act.moveToElement(watchJwellary).perform();
		//click on band
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		//go to the filtered by text
		WebElement filteredBy = driver.findElement(By.xpath("//span[text()='FILTERED BY']"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(filteredBy).perform();
		for(int i =1;i<=2;i++)
		{
			act.doubleClick(filteredBy).perform();
			Thread.sleep(2000);
			act.clickAndHold(filteredBy).perform();
			
		}
		//copy the filter by text
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		driver.findElement(By.id("search_query_top_elastic_search")).click();
		//paste the filter by text
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		//click on search button
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
	}
	

}
