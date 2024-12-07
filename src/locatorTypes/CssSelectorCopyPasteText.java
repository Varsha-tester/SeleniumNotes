package locatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorCopyPasteText {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element = driver.findElement(By.partialLinkText("Register"));
		element.click();
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Varsha");
		firstName.sendKeys(Keys.CONTROL+"a");
		firstName.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys(Keys.CONTROL+"v");
}
}
