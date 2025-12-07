package javeprogramdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCode {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlearn.in/");
		driver.manage().window().maximize();
		driver.close();
	
	WebDriver saran = new ChromeDriver();
	saran.get("https://www.facebook.com");
	
	WebDriver driver1 = new ChromeDriver();
	driver1.get("www.x.com");
	driver.manage().window().maximize();
	driver.close();
	Thread.sleep(2000);
	
	
	}
	
	

}
