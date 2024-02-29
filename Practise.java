package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practise
{

	public static void main(String[] args) 
	{
	
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
	        driver.manage().window().maximize();
	        WebElement accounts =driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	        Actions a1=new Actions(driver);
	        a1.moveToElement(accounts).perform();
	        WebElement signin=driver.findElement(By.xpath("//span[@class='nav-action-inner'][1]"));
	        signin.click();
	              WebElement email=driver.findElement(By.id("ap_email"));
	              email.sendKeys("kishoresiet@gmail.com");
	                driver.findElement(By.id("continue")).click();
	               
	               WebElement pass= driver.findElement(By.id("ap_password"));
	               pass.sendKeys("8792792855");
	               WebElement signin1= driver.findElement(By.id("Confirm@1234"));
	               signin1.click();
	               

	}

}
