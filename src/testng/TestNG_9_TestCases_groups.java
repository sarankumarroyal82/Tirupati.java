package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_9_TestCases_groups {
	WebDriver driver;
	
	
  @Test (groups="Network")
  public void jio() {
	  driver.get("https://www.jio.com");
  }
  
  @Test(groups="shopping")
  public void amazon() {
	  driver.get("https://www.amazon.com");
  }
  
  @Test (groups="entatement")
  public void maaTV() {
	  driver.get("https://www.maatv.com");
  }
  
  @Test (groups="social")
  public void facebook() {
	  
	driver.get("https://www.facebook.com");  
  
  }
  
  @Test (groups="social")
  public void x() {
	  
	  driver.get("https://www.x.com");
  }
  
  @Test (groups="shopping")
  public void flipkart () {
	  driver.get("https://www.flipkart.com");
  }
  
  @BeforeTest (groups="social")
  public void beforeTest() {
	  driver = new ChromeDriver();
  }

}
