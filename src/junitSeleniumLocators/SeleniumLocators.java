package junitSeleniumLocators;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Driver;
import java.util.List;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Id
//Name
//Classname
/*CSS Selector (we have ID OR Class) 
ID: tagname #Id attribute value
 		OR #id attribute value
Class: tagname.classa attribute value
		OR .class attribute value
		#IMP- css selector we can use if we have multiple ID's or classes Ex; class="_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy" 
														hear we have multiple classes like _42ft and 4jy0 in between we have space
										in work space we can use code like [driver.findElement(By.cssSelector("._6lti")).click();]
										but class name uniquely identifies the element*/
//linkText
//partialLinkText
//TagName
//xpath



class SeleniumLocators {
    static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}

	/*@Test
	void id() throws Exception {
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("7680055181");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Cherry@1996");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Cherry@1996");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		//driver.navigate().forward();
		//driver.findElement(By.partialLinkText("new account")).click();
		//driver.navigate().back();
		//driver.findElement(By.cssSelector("._6lti")).click();
		driver.findElement(By.xpath("div/div/div[1]/div[2]/div/div[5]/div/div/div/div[1]/div/div[2]/div/div/div/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("")).clear();
		driver.close();
	}*/

	/*@Test
	void tagname() {
	 driver.get("https://www.facebook.com/");
	 List<WebElement> Images = driver.findElements(By.tagName("img"));
	 System.out.println("total Images ="+Images.size());
	driver.close();
	}*/
	
	@Test void xpath() throws Exception{
		
		driver.get("https://www.zomato.com/hyderabad/restaurants");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Cherry@1996");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/header/nav/ul[2]/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/section[2]/section")).isSelected();
		driver.findElement(By.xpath("//*[@id=\"id-45\"]/section[2]/section/div[1]/div")).sendKeys("7680055181");
		//Thread.sleep(40000);
		
		//driver.findElement(By.xpath("/html/body/div/astro-island/div[8]/div[5]/div[3]/a[1]/div[2]/div[3]/div")).click();
	}
	
}
