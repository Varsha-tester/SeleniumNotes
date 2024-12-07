package handlingDropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithMultiSelect {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver/chromedriver.exe");
		}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	WebElement element = driver.findElement(By.id("multiselect1"));
	Select select = new Select(element);
	System.out.println(select.isMultiple());
	select.selectByIndex(0);
	select.selectByValue("swiftx");
	select.deselectByVisibleText("Hyundai");
	List<WebElement> selectedOption=select.getAllSelectedOptions();
	for(WebElement selectedElement:selectedOption) {
		System.out.println(selectedElement.getText());
	}
	System.out.println("The first selected element "+select.getFirstSelectedOption().getText());
	driver.close();
}
}
