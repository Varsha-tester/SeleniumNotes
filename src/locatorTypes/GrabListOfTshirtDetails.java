package locatorTypes;
//Not working
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrabListOfTshirtDetails {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("mobiles");
		searchBox.sendKeys(Keys.ENTER);
		List <WebElement> mobilePhones = driver.findElements(By.className(".KzDlHZ"));
		List <WebElement> mobilePrice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		HashMap<String,String> data = new HashMap();
		System.out.println("Working");
		for(int i=0;i<mobilePhones.size();i++) {
			data.put(mobilePhones.get(i).getText(),mobilePrice.get(i).getText());			
		}
		System.out.println("Working1");
		for(Entry value:data.entrySet()) {
			System.out.println(value.getKey()+"====="+value.getValue());
		}
		
		driver.close();
	}

}
