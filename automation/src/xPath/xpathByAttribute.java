package xPath;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByAttribute {
	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://demowebshop.tricentis.com/");
		 
		 
		 

		
	}
	 

}
