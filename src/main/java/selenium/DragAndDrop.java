package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
       
     WebElement sourceEle = driver.findElement(By.id("draggable"));
     WebElement targetEle = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		//act.clickAndHold(sourceEle).moveToElement(targetEle).release().build().perform();
		
		act.dragAndDrop(sourceEle, targetEle).build().perform();
	}

}
