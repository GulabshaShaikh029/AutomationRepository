package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaskPage {
	//store all the web element of task page
	@FindBy(partialLinkText = "Projects & Customers") private WebElement Project_Customer_Sub_module;
	@FindBy(xpath = "//input[@value='Create New Customer") private WebElement Create_New_Customer_Button;
	@FindBy(xpath = "/input[@value='Create New Project") private WebElement Create_New_Project_Button;
	
	@FindBy(name = "name") private WebElement Customer_nameTB;
	@FindBy(name = "createCustomerSubmit") private WebElement create_Customer_Button;
	
	@FindBy(name = "customerId") private WebElement customer_name_Dropdown;
	@FindBy(name = "name") private WebElement Project_nameTB;
	@FindBy(name = "createProjectSubmit") private WebElement create_Project_Button;
	
	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getProject_Customer_Sub_module() {
		return Project_Customer_Sub_module;
	}

	public WebElement getCreate_New_Customer_Button() {
		return Create_New_Customer_Button;
	}

	public WebElement getCreate_New_Project_Button() {
		return Create_New_Project_Button;
	}

	public WebElement getCustomer_nameTB() {
		return Customer_nameTB;
	}

	public WebElement getCreate_Customer_Button() {
		return create_Customer_Button;
	}

	public WebElement getCustomer_name_Dropdown() {
		return customer_name_Dropdown;
	}

	public WebElement getProject_nameTB() {
		return Project_nameTB;
	}

	public WebElement getCreate_Project_Button() {
		return create_Project_Button;
	}
	
	//operational methods
	public void createcustomer_createProject_method(String cust_name ,String pro_name) throws InterruptedException
	{
		Project_Customer_Sub_module.click();
		Thread.sleep(2000);
		Create_New_Customer_Button.click();
		Thread.sleep(2000);
		Customer_nameTB.sendKeys(cust_name);
		Create_New_Customer_Button.click();
		Thread.sleep(2000);
		create_Project_Button.click();
		Select sel = new Select(customer_name_Dropdown);
		sel.selectByVisibleText(cust_name);
		
		Thread.sleep(2000);
		Project_nameTB.sendKeys(pro_name);
		create_Project_Button.click();
		
		
		
		
		
	}
     
    
}
