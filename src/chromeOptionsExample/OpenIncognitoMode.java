package chromeOptionsExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenIncognitoMode {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver/chromedriver.exe");
		}
	
	public static void main(String[] args) {	

	ChromeOptions option=new ChromeOptions();
	option.addArguments("--incognito");
	WebDriver driver=new ChromeDriver(option);	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	
}
}
