package assignmentPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		//identify UsernameTextBox and pass inputs
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Admin");
		//identify PasswordTextBox and pass inputs
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("Admin123");
		//identify LoginButton and click
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'_acap ')]")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
