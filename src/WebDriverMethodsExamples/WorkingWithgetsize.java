package WebDriverMethodsExamples;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithgetsize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.Facebook.com");	
		driver.manage().window().maximize();
		Dimension size = driver.manage().window().getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println("The dimensions of Facebook maximized screen in Height and Width are:"+height+" "+"and"+"   "+width);
		driver.close();
	}

}
