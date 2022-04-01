package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("//img[@src=\"/assets/selenium-logo-c1d6f4654a0c8f8bef745f71b4e22836224aabc2116f405ef511cd79c48f2947.png\"]"));
		WebElement dest = driver.findElement(By.xpath("//*[@class=\"ui-widget-header ui-droppable\"]"));
		
		
		// Method1: (without drag and drop)
		
		Actions act=new Actions(driver);
//		act.moveToElement(source).perform();
//		Thread.sleep(2000);
//		
//		act.clickAndHold().perform();
//		Thread.sleep(2000);
//		
//		act.moveToElement(dest).perform();
//		Thread.sleep(2000);
//		
//		act.release().perform();
		
		// Method-2-- combine and build() method
		act.moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();
		
		
		//method-2 : using drag and drop
		
		//act.dragAndDrop(source, dest).perform();
	}

}
