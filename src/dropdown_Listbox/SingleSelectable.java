package dropdown_Listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(month);
		
		//s.selectByIndex(4);
		s.selectByValue("4");
		//s.selectByVisibleText("Brazil");
		
		boolean result = s.isMultiple();
		if (result==true) {
			System.out.println("Multiselectable listbox");
		}else
			System.out.println("Single selectable Listbox");
		
		driver.quit();

	}

}
