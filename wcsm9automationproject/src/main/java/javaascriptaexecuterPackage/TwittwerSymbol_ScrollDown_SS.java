package javaascriptaexecuterPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TwittwerSymbol_ScrollDown_SS {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		//scroll till twitter symbol
		WebElement twitterSymbol = driver.findElement(By.xpath("//i[@class='fab fa-twitter']"));
		//get the locatin of web element
		Point loc = twitterSymbol.getLocation();
		int xaxis=loc.getX();
		int yaxis=loc.getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		//way 2 
		//jse.executeScript("arguments[0].scollintoview(true)",twitterSymbol);
		Thread.sleep(4000);
		//take a screenshot of twitter
		File src = twitterSymbol.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/twitter.jpg");
		Files.copy(src, dest);

		
		
		
	}

}
