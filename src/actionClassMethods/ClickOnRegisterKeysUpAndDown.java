package actionClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickOnRegisterKeysUpAndDown {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Actions action=new Actions(driver);
			WebElement elemenet = driver.findElement(By.partialLinkText("Register"));
//			action.moveToElement(elemenet).perform();
			action.keyDown(Keys.CONTROL).click(elemenet).perform();
		
	}
	}
