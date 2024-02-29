//Assignment110: WAP to launch Google using get in selenium
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Launch_Browser 
{

	public static void main(String[] args) throws InterruptedException 
	{
	  ChromeDriver c1=new ChromeDriver();
      c1.get("https://www.google.com");
	 // c1.get("https://www.grotechminds.com");
	 //c1.findElement(By.id("Username")).sendKeys("basu123");
      //Thread.sleep(20000);
      //c1.close();
     //c1.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TcwMjHKTlJgNGB0YPBiLk7KBAAvxQSR&q=sbi&rlz=1C5CHFA_enIN1058IN1063&oq=sb&gs_lcrp=EgZjaHJvbWUqEwgBEC4YgwEYxwEYsQMY0QMYgAQyBggAEEUYOTITCAEQLhiDARjHARixAxjRAxiABDINCAIQABiDARixAxiABDITCAMQLhiDARjHARixAxjRAxiABDINCAQQABiDARixAxiABDIHCAUQABiABDINCAYQABiDARixAxiABDINCAcQABiDARixAxiABDIWCAgQLhiDARjHARixAxjRAxiABBiKBTIHCAkQABiPAtIBCDI5NjVqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8")
     
    // SafariDriver d1=new SafariDriver();
     //d1.get("https://www.google.com");
    FirefoxDriver f1=new FirefoxDriver();
    
   // f1.get("https://www.google.com");
   f1.get("https://www.grotechminds.com");
   // f1.getTitle();
   // f1.findElement(By.id("Username")).sendKeys("basu123");
	 
	}

}
