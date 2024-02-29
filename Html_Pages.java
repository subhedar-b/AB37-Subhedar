//Assignment117:Launch HTML page get elements by xpath 
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html_Pages 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///Users/anandudapudi/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Basavaraj");
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("subhedar");
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("Basu@123");
		driver.findElement(By.xpath("(/html/body/form/input)[1]")).sendKeys("anand");
		//driver.findElement(By.xpath("(/html/body/form/input)[2]")).sendKeys("udapudi");
		//driver.findElement(By.xpath("(/html/body/form/input)[3]")).click();
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]")).click();
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]")).click();
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]")).click();
		driver.findElement(By.xpath("(/html/body/input)[4]")).click();
		driver.findElement(By.xpath("(/html/body/input)[5]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		driver.findElement(By.linkText("Click to know about us")).click();

	}

}
