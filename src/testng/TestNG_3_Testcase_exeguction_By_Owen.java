package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

/*Priority start with 0,1,2,3...ect like that and EX: TC's we have total 4 and we have given priority for 2 TC's while running the Test cases which we have not given 
            priority first start with those 2 by Alphabetical Order and it will run priority cases start with 0,1,2.... */

public class TestNG_3_Testcase_exeguction_By_Owen {
	
	WebDriver driver;
	
  @Test (priority = 0)
  public void flipkart() {
	  driver.get("https://www.flipkart.com");
  }
  
  @Test (priority = 2)
  public void x () {
	  driver.get("https://www.x.com");  
  }
  
  @Test (priority = 1)
  public void facebook () {
	  driver.get("https://www.facebook.com");
  }
  
  @Test
  public void google() {
	  driver.get("https://www.google.com");
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
