package methodsofwebdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {
	public static void main(String[] args) throws InterruptedException {
		// to launch chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://Omayo.blogspot.com/");
		//take the address of current window or browser 
		//parent browser ...{the browser or window has controls}
		
		String parentHandle = driver.getWindowHandle();
		System.out.println("address of parent browser or window"+parentHandle);
		Thread.sleep(2000);
		//click on open a pop up window  
        driver.findElement(By.partialLinkText("open a popup window")).click();
        //get the address of parent browser as well as child browser
        
		Set<String> allHandles = driver.getWindowHandles();
		//print the address of browser use for each loop
		for(String wh:allHandles)
		{
			//system.out.println("parent Handle:"+wh+"child Handle:+wh);
			if(!parentHandle.equals(wh))
			{
				System.out.println("address of child window:"+wh);
			}
			else
			{
				System.out.println("address of parent window:"+wh);
			}
				
		}
			
		}
		
		
		
	}

