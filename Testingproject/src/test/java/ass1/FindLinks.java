package ass1;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("way2automation");
		
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		
		WebElement link=driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div[1]/div/div/div[1]/a"));
		System.out.println(link.getText());
		link.click();
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		driver.findElements(By.tagName())
		
		System.out.println(Links.size());

	}

}
