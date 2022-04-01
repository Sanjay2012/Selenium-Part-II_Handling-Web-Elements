package dropdown_Listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectableOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Dell/eclipse-workspace/Selenium%20Part%20II_Handling%20Web%20Elements/Contents/MultiSelectable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement options = driver.findElement(By.xpath("//select[@name=\"Browsers\"]"));
		Select s=new Select(options);
		
		boolean result = s.isMultiple();
		
		if (result==true) {
			System.out.println("Multiselectable listbox");
		}else
			System.out.println("Single selectable Listbox");
		
		List<WebElement> allOptions = s.getOptions();
		for (WebElement ele : allOptions) {
			System.out.println(ele.getText());
			
			if (ele.getText().equalsIgnoreCase("IE")) {
				ele.click();
		}

		
		
		
		//driver.quit();

	}
	}
}

