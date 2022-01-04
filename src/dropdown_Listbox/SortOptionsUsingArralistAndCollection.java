package dropdown_Listbox;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortOptionsUsingArralistAndCollection {

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
		
		//printing all options
		
		//1. using for loop
		
		System.out.println("Printed using for loop");
		
		for (int i = 0; i <allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText());
			
		}
		
		
		//2. using for each loop
		System.out.println("Printed using for each loop");
		
		for (WebElement ele : allOptions) {
			System.out.println(ele.getText());
			
		}
		
		
		//3. Using Iterator
		System.out.println("Printed using Iterator");
		
		Iterator<WebElement> itr = allOptions.iterator();
		while (itr.hasNext()) {
			WebElement ele = (WebElement) itr.next();
			System.out.println(ele.getText());
			
		}
		
		driver.close();
			
		}
	}
