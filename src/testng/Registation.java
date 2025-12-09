package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Registation {
	WebDriver driver;
  @Test
  public void google() {
	  driver.get("https://www.google.com");
	  driver.findElement(by.name("q").sendKeys("tirupati");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
