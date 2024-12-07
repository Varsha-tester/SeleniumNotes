package alertExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopupExample {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//		driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
}

}
