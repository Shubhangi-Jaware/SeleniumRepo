package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class advancesRelativeXpath {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.netflix.com/in/");
		
		//xpath by attribute
		  driver.findElement(By.xpath("//a [@ role='button']")).click();
		  
		 
		
	    WebElement email = driver.findElement(By.xpath("//input[@name='userLoginId']"));
		email.sendKeys("8421356994");
		
		
		//WebElement passward = driver.findElement(By.xpath("//input[@type='password']"));
		
		// xpath by using multiple attribute
		
		WebElement passward = driver.findElement(By.xpath("//input[@type='password' and @name='password']"));
	
		passward.sendKeys("Reset@123");
		
		//xpath by text
	
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		
		driver.close();
	}

}
