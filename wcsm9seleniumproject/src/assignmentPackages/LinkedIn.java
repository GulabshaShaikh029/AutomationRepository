package assignmentPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedIn {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		//identify email address and pass input as "123456789"
		driver.findElement(By.id("session_key")).sendKeys("123456789");
		Thread.sleep(2000);
		//identify Password and pass input as "abc123"
		driver.findElement(By.id("session_password")).sendKeys("abc123");
	



	}

}
