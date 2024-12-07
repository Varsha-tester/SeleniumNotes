package interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesExample {

	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		Thread.sleep(1000);
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.id("content")).getText());
		driver.switchTo().defaultContent();
		driver.navigate().to("https://www.w3schools.com/");
		driver.findElement(By.id("accept-choices")).click();
		driver.switchTo().frame("howto_iframe");
		driver.findElement(By.xpath("//a[@onclick='plusSlides(1)']")).click();
		driver.close();
		
	}
	
	
	
	
	
}
