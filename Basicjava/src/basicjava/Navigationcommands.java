package basicjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationcommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse setup files\\Eclipse\\Workspace\\Basicjava\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://WWw.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		System.out.print("Navigation is successful");
	}

}
