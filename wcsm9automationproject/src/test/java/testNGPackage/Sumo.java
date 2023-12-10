package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
  @Test
  public void method1() {
	  
	  //System.out.println("Method1 from Sumo class!!!");
	  Reporter.log("Method1 from Sumo class!!!",true);
	  
  }
  @Test
  public void method2()
  {
	  Reporter.log("Method2 from Sumo class!!!",true);
  }
}
