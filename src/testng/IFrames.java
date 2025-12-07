package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IFrames {
	WebDriver driver;
	
  @Test
  public void iFramesinHindu() throws InterruptedException {
	  driver.get("https://www.thehindu.com/news/national/modi-to-visit-ayodhya-hoist-sacred-flag-at-ram-temple/article70318455.ece");
	  Thread.sleep(10000);

	 WebElement ads = driver.findElement(By.xpath("//*[@id=\"google_ads_iframe_/22390678/TH_Desktop_AT_Billboard_Top_0\"]"));
	  //we have to create an WebElement object like above or directly we can use below line.
	  //driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"google_ads_iframe_/22390678/TH_Desktop_AT_Billboard_Top_0\"]")));
	 driver.switchTo().frame(ads);
	  driver.findElement(By.xpath("//*[@id=\"aw0\"]/img")).click();
	  Thread.sleep(3000);
	  driver.close();
  }
  @Test
  public void iFramesInHinduNews () throws InterruptedException {
	  driver.get("https://www.thehindu.com/news/national/modi-to-visit-ayodhya-hoist-sacred-flag-at-ram-temple/article70318455.ece");
	  Thread.sleep(5000);
	  driver.switchTo().frame(9);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"aw0\"]/img")).click();
	  driver.switchTo().defaultContent(); /*we are in the Iframe so if we need to click any element which is place from out side of the iframe
	  										we have to use this defaultContent() method.*/
	  driver.switchTo().parentFrame();		//within the iframe we have multiple iframes for this we can use parentFrame () method.
	  Thread.sleep(2000);
	  driver.quit();
  }
	@Test
	public void frames() throws InterruptedException {
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(3000);
		
	/*	WebElement obj = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
		driver.switchTo().frame(obj); */
		
	//	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"iframeResult\"]")));
		
	//	driver.switchTo().frame(2);  // 2nd Approach
		
		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/button")).click();
	}
	//To leave an iframe or frameset, switch back to the default content (driver.switchTo().defaultContent();)
	// Return back to parent frame (driver.switchTo().parentFrame();) 
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
