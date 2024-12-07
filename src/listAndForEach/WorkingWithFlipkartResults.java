package listAndForEach;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFlipkartResults {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("iPhone",Keys.ENTER);
	List<WebElement> mobileName = driver.findElements(By.xpath("//img[@loading='eager']/../../../../../..//div[contains(text(),'Apple')]"));
	List<WebElement> mobilePrices = driver.findElements(By.xpath("//img[@loading='eager'][1]/../../../../..//div[@class='_30jeq3 _1_WHN1']"));
	
	HashMap<String,String> data = new HashMap();
	for(int i=0;i<mobileName.size();i++) {
		data.put(mobileName.get(i).getText(), mobilePrices.get(i).getText());
	}
	
	for(Entry value:data.entrySet()) {
		System.out.println(value.getKey()+"------->"+value.getValue());
	}
	
	driver.quit();
}
}
