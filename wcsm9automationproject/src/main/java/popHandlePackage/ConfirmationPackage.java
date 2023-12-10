package popHandlePackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPackage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		Thread.sleep(2000);
		//click on confirm link
		driver.findElement(By.partialLinkText("Confirm")).click();
		//generate confirmation pop up
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		//handle confirmation
		Alert confirm = driver.switchTo().alert();
		Thread.sleep(2000);
		//accept confirmation pop up
		//confirm.accept();
		//print the text of confirmation popup
		String textofConfirmationPopup = confirm.getText();
		System.out.println(textofConfirmationPopup);
		//dismiss confirmation pop up
		confirm.dismiss();
		
		
		
	}

}
