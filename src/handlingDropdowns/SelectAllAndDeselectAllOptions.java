package handlingDropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Selenium Script to select all the options and deselect all the options
public class SelectAllAndDeselectAllOptions {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver/chromedriver.exe");
		}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		WebElement element = driver.findElement(By.id("multiselect1"));
		Select select = new Select(element);
		select.selectByIndex(0);
		select.selectByValue("swiftx");
		select.selectByValue("Hyundaix");
		select.selectByValue("audix");
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		for(WebElement selectedOption:selectedOptions) {
			System.out.println(selectedOption.getText());
		}
		select.deselectAll();
		System.out.println(select.getAllSelectedOptions());
	}
}
