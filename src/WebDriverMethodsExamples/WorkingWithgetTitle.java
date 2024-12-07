package WebDriverMethodsExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithgetTitle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Facebook.com");
		driver.getTitle(); //This just gets the title but does not print the title. 
		System.out.println(driver.getTitle()); //This prints the title.
	}

}
