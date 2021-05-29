package testDropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		//
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		List<WebElement> checkbox=driver.findElements(By.className("checkbox"));
		
		
		 for (WebElement checkboxs:checkbox)
		 {
			 checkboxs.click();
		 }
		 System.out.println(checkbox.size());
		//driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label")).click();
		//driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span")).click();

	}

}
