package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_8_Run_TCs_From_TestNG_XMLfile {
	WebDriver driver;
	
	
  @Test
  public void jio() {
	  driver.get("https://www.jio.com");
  }
  
  @Test
  public void epfo() {
  driver.get("https://www.epfo.com");
  }
  
  
  @Test
  public void amazon() {
	  driver.get("https://www.amazon.com");
  }
  
  @Test
  public void maaTV() {
	  driver.get("https://www.maatv.com");
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
  }

}
