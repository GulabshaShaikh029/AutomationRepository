package assignmentPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		//identify email address and pass input as "xyz123@gmail.com"
		driver.findElement(By.id("email")).sendKeys("xyz123@gmail.com");
		Thread.sleep(2000);
		//identify Password and pass input as "xyz123"
		driver.findElement(By.id("pass")).sendKeys("xyz123");
	}

}
