//Assignment115: Launch Google.com and click on gmail using linkText.
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Page 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.partialLinkText("Gma")).click();
		driver.findElement(By.className("laptop-desktop-only")).click();
		driver.findElement(By.id("firstName")).sendKeys("Basavaraj");
        driver.findElement(By.id("lastName")).sendKeys("Subhedar");
        driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	}

}
