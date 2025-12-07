package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class TestNG_6_TimeOut_Feature {
	
	WebDriver driver;
	
 @Test(dependsOnMethods="method2")
  public void method1() throws Exception {
	 Thread.sleep(3000);
	 System.out.println("First Execution");
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Charan");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Testing@123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
  }
  
  @Test
  public void method2() throws InterruptedException {
	  System.out.println("Second Execution");
	  driver.get("https://www.techlearn.in/admin");
  }
  
 
  @Test(priority=0)
  public void zomato() throws InterruptedException {
	  driver.get("https://www.facebook.com");
	  System.out.println("Third Execution");
	 // Thread.sleep(2000);
	/*  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("7680055181");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("//*[@id=\"pass\"]"); */
	//  driver.close();
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	 
  }
@AfterTest
public void afterTest() {
//driver.close();
}
}
