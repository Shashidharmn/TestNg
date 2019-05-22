package TestNg.test;

import org.testng.annotations.Test;

public class Groups {
	
  @Test(groups = { "1" })

  public void f() {
	  System.out.println(" Group 1 test 1");
  }
  
  @Test(groups = { "1" })
  public void f1() {
	  System.out.println(" Group 1 test 2");
  }
  
  @Test(groups = { "2" })
  public void f2() {
	  System.out.println("Group 2 test 1");
  }
  
  @Test(groups = { "2" })
  public void f3() {
	  System.out.println("Group 2 test 2");
  }
  
  @Test(groups = { "1" ,"2"})
  public void f4() {
	  System.out.println(" Group 1 group 2 test 1");
  }
}
