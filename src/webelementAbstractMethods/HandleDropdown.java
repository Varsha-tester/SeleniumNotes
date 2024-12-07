package webelementAbstractMethods;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandleDropdown {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./driver1/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
			Select select = new Select(dropdown);
			select.selectByIndex(2);
			select.selectByValue("option3");
			WebElement checkBoxOption = driver.findElement(By.id("checkBoxOption1"));
			System.out.println(checkBoxOption.isSelected());
			WebElement checkboxOption2 = driver.findElement(By.id("checkBoxOption2"));
			checkboxOption2.click();
			System.out.println(checkboxOption2.isSelected());
			WebElement textBox = driver.findElement(By.id("name"));
			System.out.println(textBox.isEnabled());
			WebElement text = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[2]"));
			String msg1 = text.getText();
			String message[] = msg1.split("W");
			System.out.println(message[0].trim());
			String[] anotherMsg = message[0].split("y");
			System.out.println(anotherMsg[1].trim());
			
			driver.close();
		}

	}

