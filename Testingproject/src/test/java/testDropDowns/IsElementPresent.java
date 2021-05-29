package testDropDowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsElementPresent {
	public static  WebDriver driver;
	/*public static boolean isElement(String locator) {
		
		try {
			
				driver.findElement(By.xpath(locator));
		return true;
		}
		catch(Throwable t) {
			return false;
		}
	}*/
	
	public static boolean isElementFind(By by) {
		 
		int size=driver.findElements(by).size();
		
		if(size==0) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.wikipedia.org/");
		System.out.println(isElementFind(By.id("js-link-box-en")));

	}

}
