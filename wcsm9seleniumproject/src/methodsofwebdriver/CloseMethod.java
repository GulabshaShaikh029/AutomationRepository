package methodsofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
	public static void main(String[] args) throws InterruptedException {
		// to launch chrome browser
		WebDriver driver=new ChromeDriver();
		//maximize the chrome browser
		driver.manage().window().maximize();
		//  launch the web application
		driver.get("https://omayo.blogspot.com/");
		// to stop the execution of script for 2 sec
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("open a popup window")).click();
		Thread.sleep(2000);
		// close the browser
		driver.close();
		
	}

}
