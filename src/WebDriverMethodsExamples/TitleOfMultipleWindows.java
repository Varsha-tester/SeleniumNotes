package WebDriverMethodsExamples;

//Incorrect program

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleOfMultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List <WebElement> tabs = driver.findElements(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul"));
		for(WebElement tab:tabs) {
		tab.sendKeys(Keys.CONTROL,Keys.ENTER);	
		}
		
		Set <String> windowsId = driver.getWindowHandles();
		String parentId = driver.getWindowHandle();
		System.out.println("ParentId:"+parentId);
		for(String windowId:windowsId) {
			System.out.println(driver.switchTo().window(windowId));
		}
		parentId=driver.getWindowHandle();
		System.out.println(parentId);
	}

}
