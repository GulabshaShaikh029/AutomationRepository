package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAssignmentMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		//store all the drag Element
		WebElement drag1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement drag2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement drag3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement drag4 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		//store all the drop Element
		WebElement drop1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement drop2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement drop3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		WebElement drop4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		//perform drag and drop from debit side
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(drag3, drop1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(drag1, drop2).perform();
		Thread.sleep(2000);
		//perform drag and drop for credit side
		act.dragAndDrop(drag4, drop3).perform();
		Thread.sleep(2000);
		act.dragAndDrop(drag2,drop4).perform();
		
	}

}
