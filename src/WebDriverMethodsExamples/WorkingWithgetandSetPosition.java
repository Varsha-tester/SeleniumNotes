package WebDriverMethodsExamples;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithgetandSetPosition {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.Facebook.com");
	Point position = driver.manage().window().getPosition();
	System.out.println(position);
	Thread.sleep(2000);
	Point point = new Point(10,50);
	driver.manage().window().setPosition(point);
	
}
}
