package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
public static void main(String[] args) {
		
		// System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver_win322\\chromedriver.exe" );
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().length());
		
		System.out.println(driver.getCurrentUrl());
		WebDriverWait wait =new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"identifierId\"]"))).sendKeys("ganeshkhaladkar");
		//driver.findElement(By.id("identifierId")).sendKeys("khaladkarganeshp@gmail.com");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();

	}


}
