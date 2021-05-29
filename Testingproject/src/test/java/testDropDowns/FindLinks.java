package testDropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		/////Find Links From All Page*********************
		//List<WebElement> Links =driver.findElements(By.tagName("a"));
		/*
		for(int i=0;i<Links.size();i++){
			
			System.out.println(Links.get(i).getAttribute("href"));
		*/	
			//Find the link in particular Block***********************
			
		WebElement Block = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[7]"));
		
		List<WebElement> Link= Block.findElements(By.tagName("a"));
		
		for(int i=0;i<Link.size();i++){
			
			System.out.println(Link.get(i).getAttribute("href"));
		
			
			
			
		}
	}

}
