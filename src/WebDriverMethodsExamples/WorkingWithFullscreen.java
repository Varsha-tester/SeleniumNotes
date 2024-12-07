package WebDriverMethodsExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFullscreen {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	driver.get("https://www.Facebook.com");
	Thread.sleep(2000);
	driver.manage().window().fullscreen();
	Thread.sleep(2000);
	driver.close();
}
}
