package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class DataProviderInput {
	WebDriver driver;
  @Test(dataProvider = "Datainput")
  public void login (String user, String Password) {
	  driver.get("https://www.techlearn.in/admin");
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys(user);
	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys(Password);
	  driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
	  try 
		{
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-my-account\"]/a"))).build().perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-logout\"]/a")).click();
			System.out.println("PASS");
		} 
		catch (Exception e) 
		{		
			System.out.println("FAIL");
		//	System.out.println("Exception due to: "+e);
		}
	  
  }

  @DataProvider (name = "Datainput")
  public String[][] login() {
    return new String[][] {
    	{"saran", "Testing@123"},
    	{"sai", "password@123"},
    	{"purushotham","Techlearn@123"}
    };
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
