package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
/*   we can add description for test cases and also we can use (priority & disabled & enabled = false
 *              EX:  (description = "icici", priority = 0, enabled = false also before @test we can add @Ignore)    */

public class TestNG_4_Description_Feature {
	WebDriver driver;
	
  @Test (description = "icici", priority = 0, enabled = false)
  public void TC_1 () {
	  driver.get("https://www.icici.com");
  }
  
  @Test(description = "HDFC")
  public void TC_2 () {
	  driver.get("https://www.HDFC.com");
  }
  
  @Test(description = "redbus")
  public void TC_3 () {
	  driver.get("https://www.redbus.com");
  }
  
  @Test (description = "Flipkart")
  public void TC_4 () {
	  driver.get("https://www.flipkart.com");
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }

}
