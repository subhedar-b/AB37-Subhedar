//Scenario:

package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Amazonsenario 
{

	public static void main(String[] args)
	{

		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();

	}

}
