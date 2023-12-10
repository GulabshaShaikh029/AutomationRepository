package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
  @Test(description="login performed!!")
  public void loginMethod() {
	  Reporter.log(" Methods1 for login page",true);
  }
  @Test(description="UserCreated",dependsOnMethods="loginMethod")
  public void createUsersMethod() {
	  Reporter.log(" Methids2 for Users page",true);
  }
  @Test(description="logout performed",dependsOnMethods="createUsersMethod")
  public void logoutMethod() {
	  Reporter.log(" Methids3 for logout page",true); 
  }

}
