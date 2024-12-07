package interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionClassexamples {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		Actions action = new Actions(driver);
		WebElement box = driver.findElement(By.id("column-a"));
		WebElement boxtarget = driver.findElement(By.id("column-b"));
		action.dragAndDrop(box, boxtarget).perform();
}
}
