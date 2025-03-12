package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		Thread.sleep(3000);
		
		By Country = By.id("Form_getForm_Country");
		
		doSelectDropdownValue(Country, "Canada");
		

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropdownValue(By locator, String value) {
		Select s = new Select(getElement(locator));
		
		List<WebElement>optionList = s.getOptions();
		int count =0;
		for(WebElement e: optionList) {
			String text =e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				break;
		}
			count ++;
		}
		
	}
	
}
