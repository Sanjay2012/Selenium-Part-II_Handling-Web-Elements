package windowPopUps;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		WebElement newWindowButton = driver.findElement(By.xpath("//*[@name=\"NewWindow\"]"));
		newWindowButton.click();
		
		Set<String> ids = driver.getWindowHandles();
		for (String str : ids) {
			driver.switchTo().window(str);
			System.out.println(driver.getTitle());
			
		}
		
		
		// convert set type into list
		
		ArrayList<String> al = new ArrayList<String>(ids);
		
		
		// id of main page
		String idOfMainPage = al.get(0);
		System.out.println("address/id of main page:  "+idOfMainPage);
		
		// child id
		String idOfChild = al.get(1);
		System.out.println("address/id of child browser page :  "+idOfChild);
		
		
		// switch focus to child popup
		
		driver.switchTo().window(idOfChild);
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		// click om home menu
		
		driver.findElement(By.xpath("//*[text()='HOME']")).click();
		
		Thread.sleep(3000);
		
		
		//Switch to main page
		driver.switchTo().window(idOfMainPage);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@name=\"home\"]")).click();
		
		//driver.close();
		
		driver.quit();
		

	}

}
