package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
	public static void main(String[] args) throws InterruptedException {
		// to launch the chrome browser
		WebDriver driver=new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// launch the web application
		driver.get("view-source:https://www.flipkart.com/");
		//take the source code of login page
		String loginPagesourceCode = driver.getPageSource();
		System.out.println(loginPagesourceCode);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
