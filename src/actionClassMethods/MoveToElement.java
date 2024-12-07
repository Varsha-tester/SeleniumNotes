package actionClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Actions action= new Actions(driver);
	WebElement computer = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
	action.moveToElement(computer).perform();
	WebElement desktop = driver.findElement(By.partialLinkText("Desktops"));
	action.moveToElement(desktop).click().perform();
	
	String url = driver.getCurrentUrl();
	if(url.contains("desktop")) {
		System.out.println("User is in Desktop page");
	}
	else {
		System.out.println("User is not in Desktop page");
	}
	
	driver.quit();
}
}
