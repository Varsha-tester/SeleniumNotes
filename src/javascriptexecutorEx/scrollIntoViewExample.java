package javascriptexecutorEx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollIntoViewExample {
	private void psvm() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.jpmorganchase.com/careers");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		WebElement target = driver.findElement(By.xpath("//span[contains(text(),'impact')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", target);
		Thread.sleep(5000);
		target.click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("By the numbers")).click();
		driver.close();

	}

}

