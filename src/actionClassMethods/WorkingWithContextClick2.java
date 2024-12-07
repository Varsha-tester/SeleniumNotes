package actionClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithContextClick2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();	
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.switchTo().frame("gdpr-consent-notice");
	driver.findElement(By.xpath("//span[contains(text(),'Accept All')]")).click();
	driver.switchTo().defaultContent();
	Actions action = new Actions(driver);
	WebElement rightClickMe = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
	action.moveToElement(rightClickMe).perform();
	action.contextClick().perform();
	WebElement pasteBtn = driver.findElement(By.xpath("//span[contains(text(),'Paste')]"));
	action.moveToElement(pasteBtn).perform();
	action.contextClick().perform();
	
	driver.quit();
}
}
