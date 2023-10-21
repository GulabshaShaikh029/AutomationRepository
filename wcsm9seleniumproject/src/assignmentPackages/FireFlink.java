package assignmentPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class FireFlink {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.fireflink.com/");
		//identify email address and pass input as "gul123@gmail.com"
		driver.findElement(By.id("emailId")).sendKeys("gul123@gmail.com");
		Thread.sleep(2000);
		//identify Password and pass input as "gul123"
		driver.findElement(By.id("password")).sendKeys("gul123");
	
	}

}
