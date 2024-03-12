package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		  String actual_title = driver.getTitle();
		  String expected_title = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		  if(actual_title.equals(expected_title))
		  {
			  System.out.println("Test Case is Pass");
		  }
		  else
		  {
			  System.out.println("Test Case is fail");

		  }
		  
			 
		
		
	}

}
