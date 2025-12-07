package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_1_execution_by_Alphabatical {
	
	WebDriver driver;
  @Test
  public void google() {
	  driver.get("https://www.google.com");
  }
  
  @Test
  public void facebook() {
	  
	driver.get("https://www.facebook.com");  
  
  }
  
  @Test
  public void x() {
	  
	  driver.get("https://www.x.com");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.quit();
  }

}
