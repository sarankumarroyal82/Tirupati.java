package testng;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class SwitchtonewTabsandWindows {
	WebDriver driver;
	
  @Test
  public void newTabs() throws InterruptedException {
	  driver.get("https://www.techlearn.in");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"mega-menu-item-12\"]/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"post-57\"]/div/div/div/div/div/div/section/div[2]/a")).click();
	  Thread.sleep(2000);
	  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(1));
	  Actions act = new Actions(driver);
	  Thread.sleep(3000);
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"acs-wrapper\"]/div/div/div/div[2]/a"))).click();
	  //driver.findElement(By.xpath("//*[@id=\"acs-wrapper\"]/div/div/div/div[2]/a")).click();
	  Thread.sleep(5000);
	  driver.close();
	  driver.switchTo().window(tabs.get(0));
	  
	  
	  driver.findElement(By.xpath("/html/body")).click();
  }
  
  @Test
  public void newtabcreate () throws InterruptedException {
	  driver.get("https://www.techlearn.in");  
	  Thread.sleep(2000);
	 // driver.switchTo().newWindow(WindowType.TAB); //to open new tab
	  driver.switchTo().newWindow(WindowType.WINDOW); // To open new window
	  
	  //driver.get("https://www.google.com");
	  driver.navigate().to("https://www.selenium.dev");
	  Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Downloads']")).click();

	 Set<String> obj = driver.getWindowHandles();  // when we have to switch to new window then use this program 
		Object s[] = obj.toArray();
		driver.switchTo().window(s[0].toString()); 
		driver.findElement(By.xpath("//a[contains(text(),'Placements')]")).click();
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
