package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerOnFacebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
	//	Thread.sleep(2000);
			driver.findElement(By.linkText("Create new account")).click();
			 // Thread.sleep(2000);
			
		driver.findElement(By.name("firstname")).sendKeys("abcdefg");
		driver.findElement(By.name("lastname")).sendKeys("cdefgh");
		driver.findElement(By.name("reg_email__")).sendKeys("8421359945");
		driver.findElement(By.name("reg_passwd__")).sendKeys("shubh@5696");
		driver.findElement(By.name("birthday_day")).sendKeys("08");
		driver.findElement(By.name("birthday_month")).sendKeys("June");
		driver.findElement(By.name("birthday_year")).sendKeys("1995");
		driver.findElement(By.className("_58mt")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
		
		
	}

}
