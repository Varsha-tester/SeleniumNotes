package FileUploads;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NaukriResumeUploadAutoIt {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException, IOException {	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.findElement(By.id("name")).sendKeys("Varsha Venugopal");
		driver.findElement(By.id("email")).sendKeys("varshav2312@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Hello123$");
		driver.findElement(By.id("mobile")).sendKeys("7022678934");
		driver.findElement(By.xpath("(//h2[@class=\"main-3\"])[1]")).click();
		Actions action = new Actions(driver);
		for(int i=1;i<=6;i++) {
			action.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"Upload Resume\"]")).click();
		
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\varsh\\OneDrive\\Desktop\\Resume.exe");
		driver.close();	
		
	}
}
