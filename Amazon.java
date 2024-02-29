package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon 
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    WebElement w=driver.findElement(By.id("searchDropdownBox"));
	    Select s1=new Select(w);
	   // s1.selectByVisibleText("Books");
	      s1.selectByValue("search-alias=luxury-beauty");
	      w.sendKeys("body lotion");
	      w.sendKeys(Keys.ENTER);
	     w.findElement(By.id("twotabsearchtextbox")).sendKeys("body lotion");
	     w.findElement(By.className("nav-input nav-progressive-attribute")).click();
	    

	}

}
