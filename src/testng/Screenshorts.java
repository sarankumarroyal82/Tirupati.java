package testng;

import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Screenshorts {
	WebDriver driver;
	
  

  public void getScreenshot() throws IOException  {
		SimpleDateFormat dateformat = new SimpleDateFormat ("DD_MM_YYYY_HH_mm_ss");
		Date date = new Date();
		String time = dateformat.format(date);
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Manual & selenium testing\\Screenshot\\charan_"+time+".png"));

}
  @Test
  public void takesScreenshot() throws Exception {
	  driver.get("https://www.facebook.com");
	  Thread.sleep(2000);
	  getScreenshot();
	  SimpleDateFormat dateformat = new SimpleDateFormat ("YYY_MM_DD_HH_MM_SS");
	  Date date = new Date();
	  String time = dateformat.format(date);
	  
	  
  }
  
  @Test
  public void elementScreenshot() throws InterruptedException, IOException {
	  driver.get("https://www.techlearn.in/admin");
	  /*Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	  ImageIO.write(s.getImage(),"PNG", new File("C:\\Manual & selenium testing\\Screenshot\\FullpageScreenshot.png"));*/
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("7680055181");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Cherry@19");  
driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
	  
	  try {
driver.findElement(By.xpath("//*[@id=\"mega-menu-item-11\"]/a"));

Thread.sleep(2000);
	  }
	  catch(Exception e) {
		  getScreenshot();
		  System.out.println(e);
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
