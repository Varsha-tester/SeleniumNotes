package webelementAbstractMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithgetLocation {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		Thread.sleep(1500);
		WebElement element1=driver.findElement(By.id("FirstName"));
		WebElement element2=driver.findElement(By.id("Password"));		
		int x1 = element1.getLocation().getX();
		int x2 = element2.getLocation().getX();
		if(x1==x2 && (x1+element1.getSize().getWidth()==(x2+element2.getSize().getWidth()))){
			System.out.println("Elements are aligned with coordinates");
		}else {
			System.out.println("Elements are not aligned");
		}
		
}
}
