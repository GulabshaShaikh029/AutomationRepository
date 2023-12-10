package popHandlePackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_Apps_File_Upload {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		//identify pop up
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		//identify file upload
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		Thread.sleep(2000);
		//identify choose file
		WebElement fileUpload = driver.findElement(By.name("file"));
		//perform double click on file button which open the file
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.doubleClick(fileUpload).perform();
		Thread.sleep(2000);
		File file = new File("./autoITPgm/Auto_prog.exe");
		String path = file.getAbsolutePath();
		Runtime.getRuntime().exec(path);
		Thread.sleep(6000);
		Runtime.getRuntime().exec(path);
		Thread.sleep(2000);
		driver.quit();
	}

}
