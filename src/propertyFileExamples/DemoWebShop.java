package propertyFileExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver/chromedriver.exe");
		}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("gender-male")).click();
		File file = new File("./src/testdata/testdata1.txt");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String fname=prop.getProperty("Fname");
		driver.findElement(By.id("FirstName")).sendKeys(fname);
		Thread.sleep(1000);
		String lname=prop.getProperty("Lname");
		driver.findElement(By.id("LastName")).sendKeys(lname);
		Thread.sleep(1000);
		String email=prop.getProperty("Email");
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(1000);
		String pwd=prop.getProperty("Pwd");
		driver.findElement(By.id("Password")).sendKeys(pwd);
		Thread.sleep(1000);
		String cPwd=prop.getProperty("Pwd");
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cPwd);
		Thread.sleep(1000);
		driver.findElement(By.id("register-button")).click();
		driver.close();
	}
	
}
