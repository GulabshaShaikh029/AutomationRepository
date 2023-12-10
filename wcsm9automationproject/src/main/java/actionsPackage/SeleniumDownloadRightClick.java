package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDownloadRightClick {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		//right click on download
		WebElement rightClick = driver.findElement(By.partialLinkText("Downloads"));
		Actions act = new Actions(driver);
		act.contextClick(rightClick).perform();
		//WebElement downloadTarget=driver.finfElement(By.xpath("//span[text()='Download']"));
	}
	
	}


