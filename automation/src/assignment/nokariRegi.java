package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nokariRegi {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.id("name")).sendKeys("Karan");
		driver.findElement(By.name("email")).sendKeys("ajajbj@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Shubh@2024");
		driver.findElement(By.id("mobile")).sendKeys("9934567890");
		driver.findElement(By.className("main-3")).click();
		
		
		
	}

}
