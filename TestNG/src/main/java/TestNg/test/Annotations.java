package TestNg.test;

import org.testng.annotations.*;

public class Annotations {
	
	
  @Test
  public void f() {
	  
	  System.out.println("@Test");
  }
  @BeforeSuite
  public void a()
  {
	  System.out.println("@BeforeSuite");
  }
  @AfterSuite
  public void a2()
  {
	  System.out.println("@AfterSuite");
  }
  @BeforeTest
  public void a3()
  {
	  System.out.println("@BeforeTest");
  }
  @AfterTest
  public void a4()
  {
	  System.out.println("@AfterTest");
  }
  @BeforeGroups
  public void a5()
  {
	  System.out.println("@BeforeGroups");
  }
  @AfterGroups
  public void a6()
  {
	  System.out.println("@AfterGroups");
  }
  @BeforeClass
  public void a7()
  {
	  System.out.println("@BeforeClass");
  }
  @AfterClass
  public void a8()
  {
	  System.out.println("@AfterClass");
  }
  @BeforeMethod
  public void a9()
  {
	  System.out.println("@BeforeMethod");
  }
  @AfterMethod
  public void a91()
  {
	  System.out.println("@AfterMethod");
  }
}
