package popHandlePackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		driver.findElement(By.partialLinkText("Prompt")).click();
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box")).click();
		//handle prompt pop up
		Alert prompt = driver.switchTo().alert();
		//send response as yes or no
		Thread.sleep(2000);
		
	    prompt.sendKeys("yes");
		Thread.sleep(2000);
		prompt.accept();
		
	}

}
