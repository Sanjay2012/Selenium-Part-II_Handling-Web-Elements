package dropdown_Listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchAndSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(month);
		List<WebElement> allOptions = s.getOptions();
		
		for (int i = 0; i < allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText());
			if (allOptions.get(i).getText().equalsIgnoreCase("nov")) {
				allOptions.get(i).click();
				break;
				
			}
			
		}
		
		
		
		
		//driver.quit();

	}

}
