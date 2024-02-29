//Assignment116
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment116 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://www.amazon.in/");
	    driver.findElement(By.partialLinkText("Arab")).click();
	    
	    driver.get("https://www.amazon.in/");
	    driver.findElement(By.partialLinkText("Kingdom")).click();
	    
	    driver.get("https://www.amazon.in/");
	    driver.findElement(By.partialLinkText("States")).click();



	}

}
