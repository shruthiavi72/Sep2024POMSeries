package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		By name = By.name("q");
		
		sendKeys(name,"selenium");
		
		Thread.sleep(3000);

		List<WebElement> suggList = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		
		System.out.println(suggList.size());
		
		for(WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("selenium testing")) {
				e.click();
				break;
			}
		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void sendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	
}
