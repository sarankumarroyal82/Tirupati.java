package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class IsDisplayed_isEnabled_isSelected {
	WebDriver driver;
	
  @Test /*isDisplayed : To check whether an element is visible on the screen
  		        Ex: To verify text, buttons, images, fields are visible 
  		            before performing actions like click().sendkeys()
  		            <<<UI testing>>>*/
  public void isDisplayedMethod() throws InterruptedException {
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(10000);
	  boolean homestyle = driver.findElement(By.xpath("//*[@id=\"CardInstanceSUpVwOm8-PWA8SWpy0RcfA\"]/div[1]/h2")).isDisplayed();
	  if (homestyle==true) 
	  { System.out.println("isDesplayed"+homestyle);
  }
	  else 
	  {
		  System.out.println("home style is not displayed in Amazion");
	  }
  }
  
  @Test  /* isEnabled : To check whether an element is enabled(usable)
            Before clicking a button 
            To verify if a text box is editable  */
  
  
  public void isEnabledMethod() throws InterruptedException {
	  
	  driver.get("https://www.techlearn.in/admin");
		Thread.sleep(3000);
		boolean email = driver.findElement(By.xpath("//*[@id=\"user_login\"]")).isEnabled();
		
		if(email==true)
		{
			System.out.println("Username or Email text box is enabled to enter the email");
			driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("omprakash");
		}
		
		else
		{
			System.out.println("Username or Email text box is Not enabled");
	
		}
		
  }
  
  @Test /* isSelected : To check whether a radio, checkbox, or option in dropdown is selected */
 
  
  public void isSelected() throws InterruptedException {
	  driver.get("https://www.techlearn.in/admin");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		Thread.sleep(2000);

		boolean check = driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).isSelected();
		
		if(check==true)
		{
			System.out.println("Rememeber Me Check box is Selected");
		}
		
		else
		{
			System.out.println("Rememeber Me Check box is NOT Selected");
		}
		
		
	}
  @Test
  public void f () {
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
  }

}
