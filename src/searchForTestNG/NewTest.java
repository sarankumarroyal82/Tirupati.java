package searchForTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	
	
  @Test
  public void techLearn () throws Exception {
	  driver.get("https://www.techlearn.in");
	  driver.findElement(By.xpath("//*[@id=\"mega-menu-item-14\"]/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"mega-menu-item-38\"]/a")).click();
	  Thread.sleep(1000);
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
