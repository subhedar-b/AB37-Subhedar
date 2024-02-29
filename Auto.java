package selenium.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("India");
		List<WebElement> results= driver.findElements(By.xpath("(//div[@class='OBMEnb']/ul/li)"));
		int counting_auto=results.size();
		//Thread.sleep(500);
		System.out.println(counting_auto);

	}

}
