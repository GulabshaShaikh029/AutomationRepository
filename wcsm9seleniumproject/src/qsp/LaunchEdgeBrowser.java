package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {
	public static void main(String[] args) throws InterruptedException {
		// to launch edge browser we need to create object of EdgeDriver();
		
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		System.out.println("Edge is open!!");
		Thread.sleep(2000);
		driver.close();
		System.out.println("Edge is close!!!");
	}

}
