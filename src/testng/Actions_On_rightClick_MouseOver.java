package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Actions_On_rightClick_MouseOver {        
	WebDriver driver;
	
  @Test
  public void flipkart_Rightclick () throws InterruptedException {
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(1000);
	  Actions act = new Actions(driver);
	  act.contextClick(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/header/div[1]/div[2]/form/div/div/input"))).build().perform();
	  Thread.sleep(2000);
  }
  
  @Test
  public void doubleClickOnLoGo () throws InterruptedException {
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  //act.doubleClick(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/header/div[1]/div[1]/a/picture/img"))).build().perform();
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/header/div[1]/div[1]/a/picture/img"))).doubleClick().build().perform();
  }
  
  @Test
  public void mouseOver() throws InterruptedException {
	  driver.get("https://www.flipkart.com/");
	  Actions act = new Actions(driver);
	  Thread.sleep(2000);
	  WebElement electronics = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[2]/div/div/span"));
	  act.moveToElement(electronics).build().perform();
	  Thread.sleep(3000);
	  WebElement cameras = driver.findElement(By.xpath("/html/body/div[5]/div[1]/object/a[3]"));
	  act.moveToElement(cameras).build().perform();
	  Thread.sleep(2000);
	  WebElement DSLR = driver.findElement(By.xpath("/html/body/div[5]/div[2]/object/a[2]"));
	  act.moveToElement(DSLR).click().build().perform();
  }
	  
	  @Test
	  public void dragAndDrop() throws InterruptedException {
		  driver.get("https://www.techlearn.in/code/drag-and-drop/");
		  Actions act = new Actions(driver);
	  WebElement drag = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));
	  WebElement drop = driver.findElement(By.xpath("//*[@id=\"div1\"]"));
	  act.dragAndDrop(drag, drop).build().perform(); 
  }
  @BeforeTest
  public void beforeTest() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
  }

}
