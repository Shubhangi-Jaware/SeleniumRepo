package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automateLoginInsta {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		WebElement email = driver.findElement(By.name("username"));
		email.sendKeys("8421359945");
		WebElement passward = driver.findElement(By.name("password"));
		passward.sendKeys("Reset@123");
		WebElement signin  = driver.findElement(By.name("-acap"));

	}

}
