package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	  Reporter.log("Hi",true);//get the console output and report
	  //System.out.println("Hi");// get console but not get report
  }
}
