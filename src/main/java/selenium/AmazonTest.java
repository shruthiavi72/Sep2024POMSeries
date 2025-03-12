package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browserName = "chrome";
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser(browserName);
		br.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailID = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.doSendKeys(emailID, "shruthi.avi72@gmail.com");
		eleutil.doSendKeys(password, "Anusha@123");
	System.out.println("login successful");
		
	}

}
