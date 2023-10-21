package methodsofwebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
  public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	//handle properties of browser
	//maximize 
	//minimize
	//fullScreen
	//setSize
	//setPosition
	
	//maximize the browser
	driver.manage().window().maximize();
	//Thread.sleep(2000);
	//minimize the browser
	//driver.manage().window().minimize();
	//Thread.sleep(2000);
	//full screen the browser
	//driver.manage().window().fullScreen();
	
	//set the size of the browser
	Dimension targetsize=new Dimension(350,450);
	driver.manage().window().setSize(targetsize);
	Thread.sleep(2000);
	
	//set position of browser
	Point targetposition=new Point(450,250);
	driver.manage().window().setPosition(targetposition);
}

}
