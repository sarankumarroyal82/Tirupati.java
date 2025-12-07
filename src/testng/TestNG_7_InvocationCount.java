package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_7_InvocationCount {
	WebDriver driver;
  
  
  @Test
  public void google() {
	  driver.get("https://www.google.com");
  }
  
  @Test(invocationCount = 3)
  public void facebook() {
	  
	driver.get("https://www.facebook.com");  
  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver= new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
