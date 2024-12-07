package locatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingIndependentDependentXpath {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iPhone");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		WebElement price = driver.findElement(By.xpath("(//img[contains(@loading,'eager')])[3]/../../../../../..//div[contains(text(),'₹')]"));
		System.out.println(price.getText());
}
}
