package assignmentPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/Login");
		//identify email address and pass input as "abc123@gmail.com"
		driver.findElement(By.tagName("input")).sendKeys("abc123@gmail.com");
		Thread.sleep(2000);

	
	}

}
