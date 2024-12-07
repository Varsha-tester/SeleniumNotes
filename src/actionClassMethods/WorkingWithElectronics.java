package actionClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithElectronics {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();	
	driver.get("https://demowebshop.tricentis.com/");
	Actions action = new Actions(driver);
	WebElement electronics = driver.findElement(By.xpath("//a[contains(text(),'Electronics')]"));
	WebElement cellPhones = driver.findElement(By.xpath("//a[contains(text(),'Cell phones')]"));
	
	action.moveToElement(electronics).perform(); //Hovers on electronics
	action.moveToElement(cellPhones).click().perform();
	
	String url = driver.getCurrentUrl();
	if(url.contains("cell-phones")) {
		System.out.println("User is in Cell phones page");
	}else {
		System.out.println("User is not in Cell Phones page");
	}
	
	driver.quit();
	
}
}
