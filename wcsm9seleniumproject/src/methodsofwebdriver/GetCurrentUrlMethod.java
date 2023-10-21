package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-K0cqo21/Login.do");
		//take a url of login page
		String UrlOfLoginPage=driver.getCurrentUrl();
		System.out.println(UrlOfLoginPage);
		Thread.sleep(2000);
		
	}

}
