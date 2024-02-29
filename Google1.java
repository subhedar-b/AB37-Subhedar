package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	    WebElement s=	driver.findElement(By.name("q"));
	    s.sendKeys("India");
	    s.sendKeys(Keys.ENTER);

	}

}


   // https://www.oracle.com/java/technologies/downloads/#jdk17-mac
	
