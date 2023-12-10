package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod_GetCssValue_GetTageNameMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//get the Attribute value of Usernametext box i.e.name attribute
		WebElement usnTB = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		String attributeValue = usnTB.getDomAttribute("class");
		System.out.println(attributeValue);
		Thread.sleep(2000);
		// get the css property of username textbox i.e.color
		String cssValue = usnTB.getCssValue("color");
		System.out.println(cssValue);
		Thread.sleep(2000);
		//get the TagName of username text box
		String tag = usnTB.getTagName();
		System.out.println(tag);
		
		
		
		
		
	}

}
