package basicjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementcommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse setup files\\Eclipse\\Workspace\\Basicjava\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		
		WebElement a = driver.findElement(By.name("username"));
		WebElement b = driver.findElement(By.name("password"));
		
		if (a.isDisplayed() && a.isEnabled() == true)
		{
			
			a.sendKeys("swapnil");
		}
		
		else {
			System.out.println("The password field is not displayed or enabled");
		}
		if (b.isDisplayed() && b.isEnabled() == true)
		{
			
			b.sendKeys("doiphode");
		}
		
		else {
			System.out.println("The password field is not displayed or enabled");
		}
		
		WebElement c = driver.findElement(By.name("checkboxes[]"));
		
		if (c.isSelected() == false) {
			c.click();
		}
		
		driver.close();
		
	}

}
