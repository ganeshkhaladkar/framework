package handleCapcha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptchDemo {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		
		String s =driver.findElement(By.xpath("//*[@id=\"mathq2\"]")).getText();
		
		System.out.println(s.length());
		for(int i=0;i<s.length();i++)
		{
			//System.out.println("Char at" +i+"-->"+s.charAt(i));
			int j=Character.getNumericValue(s.charAt(i));
			
			
			//System.out.println("addddddddd"+str1);
			//int a=Character.getNumericValue(s.charAt(0));
			//int b=Character.getNumericValue(s.charAt(4));
			//int c=a+b;
			System.out.println("int value"+ j);
			if(j!=-1) {
				
			}
			
		}
		//int add= s.charAt(1)+s.charAt(4); 
		
		//System.out.println(add);
		/*System.out.println("char at 1--"+add.charAt(0));
		System.out.println("char at 2--"+add.charAt(1));
		System.out.println("char at 3--"+add.charAt(3));
		System.out.println("char at 4--"+add.charAt(4));
		*/
		//System.out.println(add.valueOf(0) + add.valueOf(4));
		//add.
	}

}
