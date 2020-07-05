package basicjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsermethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse setup files\\Eclipse\\Workspace\\Basicjava\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		//driver.close();
		driver.quit();
		
		System.out.println("Browser is quitted successfully");
	}

}
