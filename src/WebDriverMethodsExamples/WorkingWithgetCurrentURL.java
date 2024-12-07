package WebDriverMethodsExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithgetCurrentURL {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Facebook.com");
		driver.getCurrentUrl(); //This gets the current url but does not print in the console. 
		System.out.println(driver.getCurrentUrl());//This prints the URL in the console.
	}

}
