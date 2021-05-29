package testDropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		
		//driver.findElement(By.id("oldSelectMenu")).sendKeys("Green");
		
		WebElement dropdown=driver.findElement(By.id("oldSelectMenu"));
		
		Select select = new Select(dropdown);
		select.selectByVisibleText("Black");
		
		System.out.println(select.getAllSelectedOptions());
		

	}

}
