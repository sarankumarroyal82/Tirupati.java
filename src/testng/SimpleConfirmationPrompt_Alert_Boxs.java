package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;



public class SimpleConfirmationPrompt_Alert_Boxs {
	
	WebDriver driver;
	
	
  @Test
  
  public void alertOkButton () throws InterruptedException {
	  Alert alt = driver.switchTo().alert();

		
	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
	  Thread.sleep(2000);
	  
	  alt.accept();
	//  driver.switchTo().alert().accept();
	 	 
	  //alt.accept(); //to click on Ok button on the alert when we don't Inspect
	  
  }
  
  @Test
  public void alertDismissButton () throws InterruptedException {
	  
	   
	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().dismiss();
	   //to click on cancel button on the alert when we don't Inspect
	  
  }
  
  @Test
  public void promptDialogBox () throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"post-748\"]/div/div/div/div/div/div/div/button")).click();
	  Thread.sleep(2000);
	 driver.switchTo().alert().sendKeys("Charan");
	 driver.switchTo().alert().accept();
  }
  
  @Test
  public void noAlertButton () throws InterruptedException {
	  driver.get("https://www.techlearn.in/");
	  Thread.sleep(2000);
	  Alert alt = driver.switchTo().alert();
	  alt.accept();
	  
	//  driver.switchTo().alert().accept();
  }
  
	  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	
  }

}
