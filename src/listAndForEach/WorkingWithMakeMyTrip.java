package listAndForEach;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithMakeMyTrip {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//button[@class='cookiesModal__acceptCookiesBtn buttonCls btn__primary uppercase ']")).click();
	driver.findElement(By.id("fromCity")).sendKeys("Delhi");
	List<WebElement> elements = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	for(WebElement element:elements) {
		if(element.getText().contains("Delhi")) {
			element.click();
			break;
		}
	}
	driver.findElement(By.id("toCity")).sendKeys("Mumbai");
	List<WebElement> toElements=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	for(WebElement element:toElements) {
		if(element.getText().contains("Mumbai")) {
			element.click();
			break;
			
		}
	}

Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[@class='dateInnerCell'])[17]")).click();
	
	driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
	
	
	
}
}
