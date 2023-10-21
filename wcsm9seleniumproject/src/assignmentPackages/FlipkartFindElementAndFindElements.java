package assignmentPackages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFindElementAndFindElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		//Search for laptop in search box
		driver.findElement(By.name("q")).sendKeys("laptops");
		//click on search icon
		driver.findElement(By.xpath("//button[@aria_label='search for products,Brands are more']")).click();
		//click on brand
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		//click HP 
		driver.findElement(By.xpath("//div[@class='_3879cV and (text()='HP']")).click();
		//click on core7 from processor
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i7']")).click();
		//click on OS and select the windows 11
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		//click on windows 11
		driver.findElement(By.xpath("//div[text()='Windows11']")).click();
		//select the 4 and above rating from customer rating
		driver.findElement(By.xpath("//div[text()='4* & above']")).click();
		Thread.sleep(2000);
		//identify the name of laptop
	    List<WebElement> allLaptops = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	    //identify the prize of laptops
	     List<WebElement> allPrices = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor:://div[@class='_30jeq3_1_WHN1']"));
	   
	    for(int i=0; i<allLaptops.size();i++)
	    {
	    	String laptops = allLaptops.get(i).getText();
	    	Thread.sleep(2000);
	    	System.out.println(laptops);
	    	
	    	for(int j=i; j<=i;j++)
	    	{
	    		String price=allPrices.get(j).getText();
	    		Thread.sleep(2000);
	    		System.out.println(laptops+" : "+price);
				
	    	}
	    	
	    }
		
	    	
	}

}
