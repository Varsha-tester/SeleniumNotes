package interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSizegetPositionExample {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver/chromedriver.exe");
		}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("(//div[contains(text(),'Accept all')])[2]")).click();
		/*Point position = driver.manage().window().getPosition();
		System.out.println(position);
		Thread.sleep(5000);
		Point point = new Point(-10,-10);
		driver.manage().window().setPosition(point);
		System.out.println(point);
		driver.manage().window().maximize();
		WebElement getLucky = driver.findElement(By.id("gbqfbb"));
		int x = getLucky.getLocation().getX();
		int y = getLucky.getLocation().getY();
		System.out.println(x);
		System.out.println(y);
		int x1 = getLucky.getRect().height;
		int y1 = getLucky.getRect().width;
		System.out.println(x1);
		System.out.println(y1);*/
		System.out.println(driver.findElement(By.id("gbqfbb")).getAttribute("role"));		
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.xpath("(//span[text()='Allow all cookies'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed());
	}
}
