package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automateLoginPageUsingLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("84213569945");
		WebElement passward = driver.findElement(By.name("pass"));
		passward.sendKeys("Reset@123");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		

		
		
		
		
		

	}

}
