package dropdown_Listbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();

		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(month);
		
		// to get size of dropdown
		
		List<WebElement> allOptions = s.getOptions();
		System.out.println("Total no of options available under dropdowns are:  "+allOptions.size());
		
		//sorting options using Array list
		
		
		System.out.println("Sorting options using Array list");
		ArrayList<String> rv = new ArrayList<String>();
		
		List<WebElement> lst = s.getOptions();
		
		for (WebElement ele : lst) {
			String str = ele.getText();
			rv.add(str);
		}
		
		Collections.sort(rv);
		for (WebElement s1 : lst) {
			System.out.println(s1);
			
		}
		
		
		driver.close();
			
		}
	}
