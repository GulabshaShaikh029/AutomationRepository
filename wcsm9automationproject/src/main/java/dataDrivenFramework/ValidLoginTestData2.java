package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestData2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-ro120cu/login.do");
		
		Flib2 flib2 = new Flib2();
		
		String usnData = flib2.readExelData("./src/main/resources/ActiTimeTestData.xlsx", "ValidCred", 1, 0);
		String pwdData = flib2.readExelData("./src/main/resources/ActiTimeTestData.xlsx", "ValidCred", 1, 1);
		
		driver.findElement(By.name("username")).sendKeys(usnData);
		driver.findElement(By.name("pwd")).sendKeys(pwdData);
		driver.findElement(By.id("LoginButton")).click();
	}

}
