package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flightTicket {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://paytm.com/");
		//Thread.sleep(2000);
		//click on flight ticket
		driver.findElement(By.xpath("//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']")).click();
		//from
		driver.findElement(By.xpath("(//span[@class='_38H9z'])[1]")).click();
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("Pune");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
		driver.findElement(By.xpath("//button[@class=\"rippleButton\"]")).click();
		//Thread.sleep(10000);
		//by using dynamic xpath
		WebElement price = driver.findElement(By.xpath("//span[text()='View Fare']/ancestor::div[@class='_5Cbbf']/descendant::div[@class='_2MkSl']"));
		        String flightprice = price.getText();
		        System.out.println(flightprice);
		       
	}

}
