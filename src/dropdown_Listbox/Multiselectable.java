package dropdown_Listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement options = driver.findElement(By.xpath("//select[@id=\"multiselect\"]"));
		Select s=new Select(options);
		
		boolean result = s.isMultiple();
		if (result==true) {
			System.out.println("Multiselectable listbox");
		}else
			System.out.println("Single selectable Listbox");
		
		driver.quit();

	}

}
