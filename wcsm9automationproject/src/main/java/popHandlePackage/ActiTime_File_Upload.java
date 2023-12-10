package popHandlePackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiTime_File_Upload {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-ro120cu/login.do");
		//identify username text box
		driver.findElement(By.name("username")).sendKeys("admin");
		//identify password text box
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//identify login button
		driver.findElement(By.partialLinkText("Login")).click();
		//click on setting img
		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
		//click on logo and color scheme popup
		driver.findElement(By.partialLinkText("Logo & Color Scheme")).click();
		driver.findElement(By.id("uploadNewLogoOption")).click();
		Thread.sleep(2000);
		WebElement fileButton = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		//perform double click on fileButton which open the file up
		Actions act = new Actions(driver);
		act.doubleClick(fileButton).perform();
		File file = new File("./autoITPgm/Auto_prog.exe");
		String path = file.getAbsolutePath();
		Runtime.getRuntime().exec(path);
		Thread.sleep(6000);
		Runtime.getRuntime().exec(path);
		Thread.sleep(2000);
	    //driver.quit();
		
		
		}

}
