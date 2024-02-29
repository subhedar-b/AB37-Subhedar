package selenium.program;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.zeromq.ZStar.Set;

public class Amazon_Project 
{

	public static void main(String[] args) 
	{
		//EdgeDriver driver = new EdgeDriver();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement e = driver.findElement(By.id("nav-link-accountList"));
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		
		WebElement e1 = driver.findElement(By.linkText("Sign in"));
		e1.click();
		driver.findElement(By.id("ap_email")).sendKeys("8792792855");
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("Confirm@1234");
		driver.findElement(By.id("signInSubmit")).click();
		
		//Thread.sleep(2000);
		
		WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
		Search.sendKeys("Books");
		Search.sendKeys(Keys.ENTER);
		
		WebElement Book = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[3]"));
		Book.click();
		
	//String	pid_cid=driver.getWindowHandle();
		java.util.Set<String> pid_cid = driver.getWindowHandles();
		Iterator<String> count = pid_cid.iterator();
		String pid =count.next();
		String cid = count.next();
		
		driver.switchTo().window(cid);
		WebElement Add_Cart = driver.findElement(By.id("add-to-cart-button"));
		Add_Cart.click();
		//Thread.sleep(2000);
		WebElement Proceed_Buy = driver.findElement(By.id("sc-buy-box-ptc-button"));
		Proceed_Buy.click();
		
		//driver.findElement(By.xpath("(//input[@class='a-button-input'])[4]")).click();
		
		WebElement Use_Address = driver.findElement(By.id("shipToThisAddressButton"));
		Use_Address.click();
		
		//Thread.sleep(5000); 
		WebElement Select_Debit = driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']"));
		Select_Debit.click();	
	
		
		//Thread.sleep(2000);
		WebElement Card_Details = driver.findElement(By.linkText("Enter card details"));
		Card_Details.click();
		
		WebElement First_frame =driver.findElement(By.name("ApxSecureIframe"));
		driver.switchTo().frame(First_frame);
		
		
		WebElement Card_no = driver.findElement(By.name("addCreditCardNumber"));
		Card_no.sendKeys("987654324");
		

	}

}

