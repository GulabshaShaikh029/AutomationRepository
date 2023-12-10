package popHandlePackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accept_GetText_Dismiss {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		
		//identify ClickToGetAlert and click on it 

				driver.findElement(By.id("alert1")).click();

				Thread.sleep(2000);

				//accept the popup

				 Alert alert = driver.switchTo().alert();

				Thread.sleep(2000);

				alert.accept();

				Thread.sleep(2000);
				//get the text of the popup

				String getTextOfPopup = alert.getText();

				System.out.println(getTextOfPopup);

				Thread.sleep(2000);

				//dismiss the popup

				alert.dismiss();
		
	}

}
 