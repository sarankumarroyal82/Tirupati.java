package newproject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Firstprogram {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();
driver.manage().window().fullscreen();
Thread.sleep(3000);
driver.close(); //it is only for current tab or window closed.
System.out.println(82);
WebDriver driver1 = new EdgeDriver();
driver1.get("https://www.google.com");
driver.quit(); // it is clear (or) closed all windows opened by automation and end the WebDriver session.

		String Name = "saran";
		String city = "tirupati";
		int age = 30;
		char gender = 'M';
		
	System.out.println(Name);
	System.out.println(city);
	System.out.println(age);
	System.out.println(gender);
	
	
	System.out.println(10*3-3);
	
	}
	


	
}
