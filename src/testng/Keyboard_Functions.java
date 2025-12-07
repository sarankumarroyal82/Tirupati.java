package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Keyboard_Functions {
	WebDriver driver;
	
  @Test
  public void keyBoardFunctions () throws InterruptedException {
	  driver.get("https://www.techlearn.in");
	 // driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("www.techlearn.in"+Keys.ENTER);
	  Actions act = new Actions(driver);
	  Thread.sleep(3000);
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-14\"]/a"))).build().perform();
	  
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-2798\"]/a"))).click().build().perform();
	  act.scrollToElement(driver.findElement(By.xpath("//*[@id=\"post-824\"]/div/header/h2/a"))).build().perform();
	  
  }
  @Test
  public void fileUpload () throws InterruptedException {
	  driver.navigate().to("https://www.techlearn.in/code/registration/");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"file\"]")).sendKeys("C:\\Users\\saran\\eclipse-workspace\\Tirupati\\src\\testng\\SelectDropDown.java");
	 
	  
  }
  

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
