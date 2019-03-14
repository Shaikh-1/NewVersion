package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
	@BeforeMethod
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");	
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fin.ebay.com%2F");
	}
	
	
	@Test
	public void test() {
		System.out.println("Test Successful");
	}

}
