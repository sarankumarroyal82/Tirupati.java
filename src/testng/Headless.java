package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Headless {
	WebDriver driver;
  @Test
  public void withoutBrowser() {
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("headless");
	  driver=new ChromeDriver(co);
driver.get("https://www.google.com/");
	  
	  String exptab = "Google";
	  
	  String acttab = driver.getTitle();
	  
	  Assert.assertEquals(acttab, exptab);
  }


}
