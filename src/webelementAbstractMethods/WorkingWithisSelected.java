package webelementAbstractMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithisSelected {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://demowebshop.tricentis.com/");
		boolean result=driver.findElement(By.id("pollanswers-1")).isSelected();
		System.out.println(result);
		Thread.sleep(1500);
		driver.findElement(By.id("pollanswers-1")).click();
		Thread.sleep(1500);
		boolean result1=driver.findElement(By.id("pollanswers-1")).isSelected();
		System.out.println(result1);
}
}
