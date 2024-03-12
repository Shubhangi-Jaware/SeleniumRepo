package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class automateDemoWebShop {

	public static void main(String[] args) {
 
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 driver.get("https://demowebshop.tricentis.com/");
		 
		 driver.findElement(By.className("ico-register")).click();
		 driver.findElement(By.className("forcheckbox")).click();
		 
		 
		 driver.findElement(By.name("FirstName")).sendKeys("Shubhangi");
		 
		 driver.findElement(By.name("LastName")).sendKeys("Jaware");
		 
		 driver.findElement(By.name("Email")).sendKeys("shubhangijaware@gmail.com");
		 
		 driver.findElement(By.name("Password")).sendKeys("Shubh@2024");
		 
		 driver.findElement(By.name("ConfirmPassword")).sendKeys("Shubh@2024");
		 
		 driver.findElement(By.name("register-button")).click();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
