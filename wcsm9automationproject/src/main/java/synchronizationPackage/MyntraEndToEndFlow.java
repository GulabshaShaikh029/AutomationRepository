package synchronizationPackage;
import java.time.Duration;

import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraEndToEndFlow {

public static void main(String[] args) {

	 	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
        //applying implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.myntra.com/");
        //search for shoes
        driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shoes");
        //click on search icon
        driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
        //click on first suggested shoes

	 	driver.findElement(By.xpath("//img[@class='img-responsive']")).click();

	 	//get the address of parent window

		 String parentHandle = driver.getWindowHandle();

		//get the address of all the windows

		 Set<String> allHandles = driver.getWindowHandles();

		//switch control from parent to child window

		 for(String wh:allHandles)

		 {

			 if(!parentHandle.equals(wh));

			 {

				 driver.switchTo().window(wh);

			 }

		 }

		 //select the size for shoes like 7 no.

		 driver.findElement(By.xpath("//p[text()='7']")).click();

		 //add pincode

		 driver.findElement(By.xpath("//input[(@class='pincode-code')]")).sendKeys("411033");

		 //click on check button

		 driver.findElement(By.xpath("//input[(@value='Check')]")).click();

		 //click on add to cart button

		 driver.findElement(By.xpath("//div[contains(@class,'pdp-add-to-bag')]")).click();

		 //click on go to bag button

		 driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();

		//get the address of child window

		 String childHandle = driver.getWindowHandle();

			//get the address of all the windows

			 Set<String> alllHandles = driver.getWindowHandles();

			//switch control from parent to child window

			 for(String whh:alllHandles)

			 {

				 if(!childHandle.equals(whh));

				 {

					 driver.switchTo().window(whh);

				 }

			 }

		 //click on ok got it popup

		 driver.findElement(By.xpath("//div[@class='itemComponents-base-invisibleBackDrop']")).click();

		 //click on remove button

		 driver.findElement(By.xpath("//button[@class='inlinebuttonV2-base-actionButton bulkActionStrip-desktopBulkRemove']")).click();

		 //click on remove which is displayed on popup

		 driver.findElement(By.xpath("//div[@class='inlinebuttonV2-base-action  confirmOrCancelModal-buttonClass']")).click();

		

	}	 





}

	


