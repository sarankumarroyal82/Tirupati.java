package testng;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Log4j {
	WebDriver driver;
  @Test   //log4j use for information print in the console and html format in the log folder below referenced Libraries
  			// in side the log folder we have file name with html so we have to open with web. 
  public void logInModule() throws InterruptedException {
	  
	  driver.get("https://techlearn.in");
	  
	  Logger log =  Logger.getLogger("logIn Module");
	  PropertyConfigurator.configure("log4j.properties");
	  
	  driver.get("https://www.techlearn.in/admin");
	  log.info("URL page opened");
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Charan");
	  Thread.sleep(2000);
	  log.info("User ID entered in the field");
	  
	  driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("Test@12345");
	  log.info("Password entered in the field");
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
