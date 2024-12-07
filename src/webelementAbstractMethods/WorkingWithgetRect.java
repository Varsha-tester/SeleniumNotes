package webelementAbstractMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithgetRect {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(1000);
		WebElement element1=driver.findElement(By.id("Email"));
		WebElement element2=driver.findElement(By.id("Password"));
		if((element1.getRect().getHeight())==(element2.getRect().getHeight())||(element1.getRect().getWidth()==(element2.getRect().getWidth()))){
			System.out.println("Textboxes are of same size");
		}
		else {
			System.out.println("Textboxes are not of same size");
		}
		
		if((element1.getRect().x==element2.getRect().x)||(element1.getRect().x+element1.getRect().getWidth())==(element2.getRect().x+element2.getRect().getWidth())) {
			System.out.println("Elements are aligned with each other");
		}else {
			System.out.println("Elements are not aligned");
		}
}
}