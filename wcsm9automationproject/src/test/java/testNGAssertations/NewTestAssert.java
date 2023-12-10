package testNGAssertations;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTestAssert {
  @Test
  public void assertMethod() {
	  Reporter.log("Launch Browser!!",true);
	  Reporter.log("Launch WebApplication by using url",true);
	  
	  Reporter.log("Verify and Validate the loginPage",true);
	  //Apply softAssert
	 SoftAssert sa = new SoftAssert();
	 sa.assertEquals(true, false);//soft assert
	 
	 Reporter.log("Launch Performed!!",true);
	 
	 Reporter.log("Verify and Validate the Homepage",true);
	 //apply HardAssert
	 Assert.assertEquals(true, true);//hard assert
	 
	 Reporter.log("User Created!!",true);
	 
	 Reporter.log("Task Created!!",true);
	  
  }
}
