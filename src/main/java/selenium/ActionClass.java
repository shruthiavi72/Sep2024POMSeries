package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	
	static WebDriver driver;

	public static void	main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
//		WebElement addons = driver.findElement(By.xpath("//div[text()='Add-ons']"));
//		Actions act = new Actions(driver);
//		
//		act.moveToElement(addons).build().perform();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()='Student Discount']")).click();
		
	

	selectSubMenu("div", "Add-ons", "Student Discount");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	
	
	public static void selectSubMenu(String htmltag, String parentMenu, String childMenu) throws InterruptedException {
	By parentLocator = By.xpath("//"+htmltag+"[text()='"+parentMenu+"']");
	By childLocator = By.xpath("//"+htmltag+"[text()='"+childMenu+"']");
	
	WebElement parentMenuElement = getElement(parentLocator);
	Actions act = new Actions(driver);
	act.moveToElement(parentMenuElement).build().perform();
	Thread.sleep(2000);
	doClick(childLocator);
	
	}
}