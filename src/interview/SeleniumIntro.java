package interview;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumIntro {
public static void main(String[] args) throws Exception {

System.setProperty("webdriver.chrome.driver", "./driver/chromedriver/chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

// driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

driver.get("https://the-internet.herokuapp.com/");

driver.findElement(By.linkText("Multiple Windows")).click();

driver.findElement(By.xpath("//a[@href='/windows/new']")).click();

// driver.findElement(By.cssSelector("a[href*='windows']")).click();

Set<String> windows = driver.getWindowHandles();

Iterator<String> it = windows.iterator();

String parentId = it.next();

String childId = it.next();

driver.switchTo().window(childId);

System.out.println(driver.findElement(By.tagName("h3")).getText());

driver.switchTo().window(parentId);

System.out.println(driver.findElement(By.tagName("h3")).getText());

}

}