package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoappEndToEnd {
	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 
	 driver.get("https://demowebshop.tricentis.com/");
	 
     driver.findElement(By.xpath("//a[text()='Log in']")).click();
     driver.findElement(By.name("Email")).sendKeys("shubhangijaware@gmail.com");
	 
	 driver.findElement(By.name("Password")).sendKeys("Shubh@2024");
	 
 
	 driver.findElement(By.xpath("//input[@ value='Log in']")).click();
	 driver.findElement(By.linkText("Books")).click();
	 //xpath for select 1stBooks   //ul[@class= 'top-menu']/descendant::a[contains(text(),'book')]
	 
	 driver.findElement(By.xpath("//a[text()= 'Computing and Internet']/ancestor::div[@class='item-box']/descendant::input[@ type='button']")).click();
	 driver.findElement(By.xpath("//span[text()= 'Shopping cart']")).click();
	 driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
	 
	//WebElement Dropdown = driver.findElement(By.id("CountryId"));

	//Select s = new Select(Dropdown);
	//s.selectByValue("India");
	
	 driver.findElement(By.xpath("//input[@name='termsofservice']")).click();
	 driver.findElement(By.xpath("//input[@name='termsofservice']")).click();
	//div [id='billing-buttons-container']/s
	 
	}

}
