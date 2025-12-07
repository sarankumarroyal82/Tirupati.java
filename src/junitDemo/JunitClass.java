package junitDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitClass {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	driver = new ChromeDriver();	
	driver.manage().window().maximize();
	Thread.sleep(3000);
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	Thread.sleep(3000);
	driver.close();
		
	}
	//@Disabled is used for not execute the test case
	//@Ignore is used for skip the test case
	@Test
	void facebook() throws InterruptedException {
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
		
	}
    
	@Test
	void flipkar() throws InterruptedException {
	driver.get("https://www.flipkar.com");
	Thread.sleep(5000);
	}
	
	@Test
	void amazon() throws InterruptedException {
	driver.get("https://www.amazon.com");
	Thread.sleep(4000);
	}
	@Disabled
	@Test
	void techlearn() {
	driver.get("https://www.techlearn.in");	
		
	}
	@Ignore
	@Test
	void x() {
	driver.get("https://www.x.com");
	}
	
	
}
