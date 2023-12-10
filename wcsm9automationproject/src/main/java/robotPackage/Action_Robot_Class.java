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

public class Action_Robot_Class {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		//identify selenium level sponsers element
	    WebElement Getting_Startedtarget = driver.findElement(By.xpath("//h2[text()='Getting Started']"));
	    //perform right click on 
	    Actions act = new Actions(driver);
	    act.contextClick(Getting_Startedtarget).build().perform();
	    //press pagedown go till to inspect
	    Robot robot = new Robot();
	    for(int i =0;i<=10;i++)
	     {
		   Thread.sleep(2000);
		   robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		   robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 }
	    Thread.sleep(2000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	
		
		
	}

}
