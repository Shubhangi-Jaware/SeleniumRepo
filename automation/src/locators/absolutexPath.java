package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class absolutexPath {
	public static void main(String[] args) {
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.findElement(By.xpath("html/body/div/div/div/div/div/ul/li[2]")).click();
		
	}
	
	

}
