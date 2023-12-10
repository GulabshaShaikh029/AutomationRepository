package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Scroll_Disable_Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		//scroll till to the disabled button 
		WebElement disableTextBox = driver.findElement(By.id("tb2"));
		Point loc = disableTextBox.getLocation();
		int xaxis=loc.getX();
		int yaxis=loc.getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-40)+")");
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('tb2').value='Automatin Testing'");
		File src = disableTextBox.getScreenshotAs(OutputType.FILE);
		File dest= new File("./ScreenShot/disableTextBox.png");
		Files.copy(src, dest);
		
		
	}

}
