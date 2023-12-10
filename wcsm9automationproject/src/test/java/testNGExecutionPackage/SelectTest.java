package testNGExecutionPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectTest {
	static WebDriver driver;
	
  @Parameters({"browser","url","username","password"})
  @Test
  public void selectTestMethod(String browserValue,String url,String usn,String pass) throws InterruptedException 
  {
	 if(browserValue.equalsIgnoreCase("chrome")) 
	 {
		driver=new ChromeDriver(); 
		
	 }
	 else if(browserValue.equalsIgnoreCase("firefox"))
	 {
		 driver=new FirefoxDriver(); 
	 }
	 else if(browserValue.equalsIgnoreCase("edge"))
	 {
		 driver=new EdgeDriver(); 
	 }
	 else
	 {
		 Reporter.log("Enter Valid browservalue!!",true);
	 }
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get(url);
	 driver.findElement(By.name("username")).sendKeys(usn);
	 driver.findElement(By.name("pwd")).sendKeys(pass);
	 driver.findElement(By.id("loginButton")).click();
	 Thread.sleep(2000);
	 driver.quit();
  }
}