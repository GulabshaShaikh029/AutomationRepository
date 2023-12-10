package keywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib {
	//base test class used to open and close the browser
	//it is generic class which has implementation of launch and close the browser used to call the method and read
     static WebDriver driver;
	 public void openBrowser() throws IOException
	 {
		Flib flib = new Flib();//it is used to read the data from property file
		//to read the data from property file call the method with the help of reference variable
		String browserValue = flib.readDataFromProperty("./src/main/resources/config.properties", "browser");
		String url = flib.readDataFromProperty("./src/main/resources/config.properties", "url");
	  if(browserValue.equalsIgnoreCase("Chrome"))
	  {
		driver=new ChromeDriver() ; 
	  }
	  else if(browserValue.equalsIgnoreCase("Firefox"))
	  {
		  driver= new FirefoxDriver();
	  }
	  else if(browserValue.equalsIgnoreCase("Edge"))
	  {
		 driver=new EdgeDriver();
	  }
	  else
	  {
		  System.out.println("BrowserValue is Invalid!!!");
	  }
	  //to generalize the code we do this after else block
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get(url);
	 }
	 public void closeBrowser()
	 {
		driver.quit(); 
	 }
}
