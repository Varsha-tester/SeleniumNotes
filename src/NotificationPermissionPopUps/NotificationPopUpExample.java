package NotificationPermissionPopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//WAS to load redbus, accept or disable the notification pop up 
public class NotificationPopUpExample {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver/chromedriver.exe");
		}
	
	public static void main(String[] args) {		
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		
	}
	
}
