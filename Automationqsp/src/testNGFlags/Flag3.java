package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
  @Test(invocationCount = 100)
  public void a() 
  {
	  Reporter.log("generates the inconsistent bug", true);
  }
}