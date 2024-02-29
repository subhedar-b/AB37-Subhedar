//Assignment111: Get the title of flipkart.com and save each word in an array
package selenium.program;

import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String s=driver.getTitle();
		System.out.println(s);
		char[] c=s.toCharArray();
		System.out.println(Arrays.toString(c));

	}

}
