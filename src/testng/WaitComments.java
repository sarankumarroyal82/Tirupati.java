package testng;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

// 1: Implicit Wait:- driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

// 2: Explicit Wait:- WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//    wait.until(ExpectedConditions.visibilityofElementLocated(by.xpath("login")));

// 3: FluentWait:- FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
//                 WebElement log =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//login']")));

// 4: setScriptTimeout:-  driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));

// 5: pageLoadTimeout:-  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));


public class WaitComments {
	WebDriver driver;
	
	@Test
	  public void implicitWait() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
  @Test
  public void explicitWait() {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//login']")));
	  driver.findElement(By.xpath("login")).click(); 
  }
	  @Test
	  public void fluentWait() {
FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
			WebElement log =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//login']")));
			log.click();  
}
	 
	  @Test
	  public void setScriptTimeout() {
		  driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
	  }
	  
	  @Test
	  public void pageLoadTimeout() {
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	  }
  @BeforeTest
  public void beforeTest() {
  }

}
