package tabandPopUP;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabAndPopups {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Set<String> windosid=driver.getWindowHandles();
		Iterator<String> iterate  = windosid.iterator();
		System.out.println(iterate.next());
		
		driver.findElement(By.xpath("//*[@id=\"custom-button\"]/button")).click();
		
		windosid=driver.getWindowHandles();
		iterate  = windosid.iterator();
		System.out.println(iterate.next());
		String scondwindow = iterate.next();
		
		driver.switchTo().window(scondwindow);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[12]/div[3]/div/div/div/div/div[2]/div[2]/div[2]/div[3]/a[2]")).click();
		
		windosid=driver.getWindowHandles();
		iterate  = windosid.iterator();
		System.out.println(iterate.next());
		System.out.println(iterate.next());
		String threewindow = iterate.next();
		
		driver.switchTo().window(threewindow);
		System.out.println(driver.getTitle().contains("NetBanking "));
		
	}

}
