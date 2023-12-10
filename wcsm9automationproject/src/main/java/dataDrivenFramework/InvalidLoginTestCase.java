package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://desktop-ro120cu/login.do ");
	
	WriteExcelDataInFlib flib = new WriteExcelDataInFlib();// call the file writeExcelDataInFlib to create object
	int rc = flib.rowCount("./src/main/resources/ActiTimeTestData.xlsx", "InValidCred"); 
	Flib2 flib1 = new Flib2();
	 
	 for(int i=1; i<=rc; i++)
	 {
		String usnData = flib1.readExelData("./src/main/resources/ActiTimeTestData.xlsx", "InValidCred", i, 0);
		String pwdData = flib1.readExelData("./src/main/resources/ActiTimeTestData.xlsx", "InValidCred", i, 1);
		 driver.findElement(By.name("username")).sendKeys(usnData);
		 driver.findElement(By.name("pwd")).sendKeys(pwdData);
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("username")).clear();
		 
	 }
			

	}

}
