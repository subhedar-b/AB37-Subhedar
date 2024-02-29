package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Different_Methods 
{

	public static void main(String[] args) 
	{
		ChromeDriver e1=new ChromeDriver();
		//c1.get("https://www.grotechminds.com/registration");
		//c1.findElement(By.id("Username")).sendKeys("basu123");
		//c1.findElement(By.id("username")).sendKeys("abc");
		
		//EdgeDriver e1=new EdgeDriver();
		e1.get("https://www.grotechminds.com/registration");
		e1.manage().window().maximize();
		e1.findElement(By.id("Username")).sendKeys("Mahesh123");
		e1.findElement(By.id("password")).sendKeys("Swati@123");
		
		
		

	}

}
