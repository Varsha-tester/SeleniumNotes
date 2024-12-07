package robotClassExamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotExample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.id("L2AGLb")).click();
		//WebElement frame = driver.findElement(By.xpath("//iframe[@role='presentation']"));
		//driver.switchTo().frame(frame);
		//driver.findElement(By.xpath("//button[@aria-label='Stay signed out']")).click();
		//driver.switchTo().defaultContent();
	    //driver.findElement(By.xpath("//div[@class='SDkEP']")).click();
		driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_J);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_ENTER);
		


	}

}
