package testng;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class TabTitle_ApplicationURL_ApplText {
	WebDriver driver;
	
  @Test
  public void verifyTabTitle() throws InterruptedException {
	  driver.get("https://www.google.com");
	  Thread.sleep(3000);
	  Actions act = new Actions(driver);
	  String expectedTabTitle = "Google";
	  System.out.println("expected Tab Title :" +expectedTabTitle);
	  String actualTabTitle = driver.getTitle();
	  System.out.println("actual tab Title :" +actualTabTitle);
	  Assert.assertEquals(actualTabTitle, expectedTabTitle);
	  }
  @Test
  public void VerifyApplicationURL () throws InterruptedException {
	  driver.get("https://www.facebook.com");
	  Thread.sleep(2000);
	  String exptdURL = "https://www.facebook.com/";
	  String actualURL = driver.getCurrentUrl();
	  System.out.println("Actual URL :"+actualURL);
	  Assert.assertEquals(exptdURL, actualURL);
  }
  
  @Test
  public void verifyApplcttext () throws InterruptedException {
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("");
	  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Cherry@1996");
	  Thread.sleep(3000);
	  driver.findElement(By.name("login")).click();
	  Thread.sleep(2000);
	  String exptText = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
	  String actualText = driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]")).getText();
	  System.out.println("current : "+actualText);
	  Assert.assertEquals(exptText, actualText); 
  }
  
  @Test
  public void verifyAmazionLoginText () throws InterruptedException {
	  driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	  Thread.sleep(4000);
	 /* driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("");
	  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Cherry@1996");
	  Thread.sleep(3000);
	  driver.findElement(By.name("login")).click();
	  Thread.sleep(2000);*/
	  String exptText = "Enter mobile number or email";
	  String actualText = driver.findElement(By.xpath("//*[@id=\"claim-collection-container\"]/p[1]")).getText();
	  Thread.sleep(3000);
	  System.out.println("current Amazion Login Text : "+ actualText);
	  Assert.assertEquals(exptText, actualText);
  }
	  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
