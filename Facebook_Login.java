//Assignment112: Login to Facebook using id,name locator 
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("basu@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("basu@12345");
		driver.findElement(By.name("login")).click();
		
		
		
	}

}
