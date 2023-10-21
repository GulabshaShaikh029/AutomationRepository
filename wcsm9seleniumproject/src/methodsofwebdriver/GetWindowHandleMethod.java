package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {
	public static void main(String[] args) {
		// to launch chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://Omayo.blogspot.com/");
		//take the address of current window or browser 
		//parent browser ...{the browser or window has controls}
		
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
	}

}
