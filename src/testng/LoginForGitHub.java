package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LoginForGitHub {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.google.com");
	  driver.findElement(by.name("q")).sendKeys("Hello_gitHub");
  }
	@Test
	public void admin(){
		driver.get("https://www.techlearn.in");
	}
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
