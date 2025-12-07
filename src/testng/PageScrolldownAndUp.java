package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.BeforeTest;

public class PageScrolldownAndUp {
	
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	 
	  driver.get("https://www.selenium.dev");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
	  JavascriptExecutor jse = (JavascriptExecutor) driver; //InterFace we have to use and pair brasies give like first with end JavascriptExecutor) 
	  jse.executeScript("scroll(0,3150)");                 //then we have to give (JavascriptExecutor // jse we can call it as a variable 
	  Thread.sleep(3000);									// scroll within (x,y) values we have to give.
	  jse.executeScript("scroll(0,-3000)");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
	  Thread.sleep(5000);
	  

	  //driver.close();
  }
  @Test
  public void coordinateOfElement () throws InterruptedException {
	  driver.get("https://www.selenium.dev");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
	  WebElement element = (WebElement) driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a"));
	  Coordinates cord = ((Locatable)element).getCoordinates();
	  cord.onPage();
	  cord.inViewPort();
	  driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
