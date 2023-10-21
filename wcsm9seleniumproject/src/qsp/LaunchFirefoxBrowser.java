package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		// to launch Firefox browser we need to create object FirefoxDriver();
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Firefox is open!!");
		Thread.sleep(2000);
		driver.close();
		System.out.println("Firefox is close!!!");
	}

}
