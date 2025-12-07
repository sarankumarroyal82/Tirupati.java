package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class SelectDropDown {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Create new account")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.name("firstname")).sendKeys("Charan");
	  driver.findElement(By.name("firstname")).sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
	  driver.findElement(By.name("lastname")).sendKeys("Samakuri");
	 Select Date = new Select  (driver.findElement(By.xpath("//*[@id=\"day\"]")));
	 Date.selectByVisibleText("23");
	 Select Month = new Select (driver.findElement(By.xpath("//*[@id=\"month\"]")));
	 Month.selectByIndex(4);
	 Select Year = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
	 Year.selectByValue("1996");
	   
	  //driver.close();
  }
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
