package basicjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlesstesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse setup files\\Eclipse\\Workspace\\Basicjava\\Chromedriver\\chromedriver.exe");
ChromeOptions options = new ChromeOptions();

options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://newtours.demoaut.com/");
		//Thread.sleep(2000);
		driver.quit();
		System.out.println("Test is successful");
	
	}

}
