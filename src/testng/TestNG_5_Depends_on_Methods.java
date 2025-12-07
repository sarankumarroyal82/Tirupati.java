package testng;

import org.testng.annotations.Test;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_5_Depends_on_Methods {
	
	WebDriver driver;
	
 @Test (dependsOnMethods = "method2")
  public void method1() throws Exception {
	  
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Charan");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Testing@123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
  }
  
  @Test
  public void method2() {
	  driver.get("https://www.techlearn.in/admin");
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
  }

}
