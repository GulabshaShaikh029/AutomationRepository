package assignmentPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		//identify phone or email address and pass input as "9876543345"
		driver.findElement(By.id("Phone number, username, or email")).sendKeys("9876543345");
		Thread.sleep(2000);
		//identify Password and pass input as "abc123"
		driver.findElement(By.id("Password")).sendKeys("abc123");
	
	}

}
