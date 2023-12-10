package assignmentpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneChatBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		//handle hidden division pop up
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		//switch the control to frame
		//identify frame and store it is a wenElement
		WebElement frameElement = driver.findElement(By.id("fc_widget"));
		//driver.switchTo().frame("fc_widget");//string name or id
		
		driver.switchTo().frame(frameElement);
		//click on chat box
        driver.findElement(By.id("chat-icon")).click();
        //handle all the text box present inside chat box
		//all the text box are designed under main webpage so switch back to main web page
        Thread.sleep(2000);
		driver.switchTo().defaultContent();
	    //in chatbox pass name as gulabsha
		driver.findElement(By.id("chat-fc-name")).sendKeys("gulabsha");
		//pass email as gul@gmail.com
		driver.findElement(By.id("chat-fc-email")).sendKeys("gul@gmail.com");
		//pass mobile no.9876543210
		driver.findElement(By.id("chat-fc-phone")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Start Chat")).click();
		Thread.sleep(2000);
		
		
		
		
	}

}
