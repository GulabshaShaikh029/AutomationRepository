package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeValidLogin extends BaseTest {
   
	public static void main(String[] args) throws IOException, InterruptedException {
		//launch the browser and close the browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		//to read the data from property file
		Flib flib = new Flib();
		
		//identify username text box
		driver.findElement(By.name("username")).sendKeys(flib.readDataFromProperty("./src/main/resources/config.properties", "username"));
		driver.findElement(By.name("pwd")).sendKeys(flib.readDataFromProperty("./src/main/resources/config.properties", "password"));
		driver.findElement(By.id("loginButton")).click();
		
		
		//WebElement usnTB = driver.findElement(By.name("username"));
		//usnTB.sendKeys(flib.readDataFromProperty("./src/main/resources/config.properties", "username"));
		//WebElement passTB = driver.findElement(By.name("pwd"));
		//passTB.sendKeys(flib.readDataFromProperty("./src/main/resources/config.properties", "password"));
		//driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		bt.closeBrowser();  
	}
}