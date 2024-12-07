package handlingDropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDOB {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//button[contains(@title,'Allow all cookies')]")).click();
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	WebElement day=driver.findElement(By.id("day"));
	Select select = new Select(day);
	select.selectByValue("10");
	WebElement month = driver.findElement(By.id("month"));
	Select selectMonth = new Select(month);
	selectMonth.selectByIndex(11);
	WebElement year= driver.findElement(By.id("year"));
	Select selectYear = new Select(year);
	selectYear.selectByVisibleText("2024");
	driver.close();
}
}
