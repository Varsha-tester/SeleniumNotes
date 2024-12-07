package webelementAbstractMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithgetAttribute {
	static {	
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");		
}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1500);
		WebElement element = driver.findElement(By.id("newsletter-subscribe-button"));		
		System.out.println(element.getAttribute("value"));
	}
}
