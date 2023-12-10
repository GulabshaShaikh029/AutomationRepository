package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeInvalidLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		//to launch and close the browser
		BaseTest bt = new BaseTest();
		
		 // to read the data from excel file
		Flib flib = new Flib();
		int rc = flib.rowCount("./src/main/resources/ActiTimeTestData.xlsx","InValidCred");
		
	
		for(int i=1;i<=rc;i++) 
		{
		String inValidUsn = flib.readExelData("./src/main/resources/ActiTimeTestData.xlsx","InValidCred", i, 0);
		String inValidPass = flib.readExelData("./src/main/resources/ActiTimeTestData.xlsx", "InValidCred", i, 1);
		bt.openBrowser();
		//identify username text box
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys(inValidUsn);
		//identify password text box
		WebElement passTB = driver.findElement(By.name("pwd"));
		//identify login button and click
		passTB.sendKeys(inValidPass);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		}
		bt.closeBrowser();
	}
}
