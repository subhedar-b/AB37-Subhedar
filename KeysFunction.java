package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysFunction 
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Basu@gmail.com");
		driver.findElement(By.id("email")).sendKeys(Keys.COMMAND+"A");
		driver.findElement(By.id("email")).sendKeys(Keys.COMMAND+"C");
		driver.findElement(By.id("pass")).sendKeys(Keys.COMMAND+"V");
		
		
		
	}

}
