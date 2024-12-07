package WebDriverMethodsExamples;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithsetSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Facebook.com");
		Dimension dimension = new Dimension(600,800);		
		driver.manage().window().setSize(dimension);
		Thread.sleep(2000);
		driver.close();
	}

}
