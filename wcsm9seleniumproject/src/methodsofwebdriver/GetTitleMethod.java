package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	public static void main(String[] args) throws InterruptedException {
		// to launch chrome browser
		WebDriver driver=new ChromeDriver();
		//maximize the chrome browser
		driver.manage().window().maximize();
		//  launch the web application
		driver.get("https://www.flipkart.com/");
		// to stop the execution of script for 2 sec
		Thread.sleep(2000);
		String titleofpage=driver.getTitle();
		System.out.println(titleofpage);
		System.out.println(driver.getTitle());
		
	
	
	}

}
