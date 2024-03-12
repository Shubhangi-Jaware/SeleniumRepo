package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automateNetflixUsingLocator {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.netflix.com/in/Login");
		WebElement email = driver.findElement(By.name("userLoginId"));
		email.sendKeys("8421356994");
		WebElement passward = driver.findElement(By.name("password"));
		passward.sendKeys("Reset@123");
		//Thread.sleep(2000);
		
		
		
		WebElement login = driver.findElement(By.className("login-button"));
		
		login.click();
	 

	}

}
