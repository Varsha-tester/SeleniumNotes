package actionClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();	
	driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
	Actions action = new Actions(driver);
	WebElement plusBtn = driver.findElement(By.id("add"));
	action.moveToElement(plusBtn).doubleClick().perform();
	//To click on plus sign 4 times
	for(int i=1;i<=4;i++) {
		action.moveToElement(plusBtn).doubleClick().perform();
		Thread.sleep(1500);
	}
	driver.quit();
	
}
}
