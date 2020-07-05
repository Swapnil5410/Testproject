package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Headlessfirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecho.driver", "E:\\Eclipse setup files\\Eclipse\\Workspace\\Basicjava\\gechodriver\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();

		//options.addArguments("--headless");
		options.setHeadless(true);
				WebDriver driver = new FirefoxDriver(options);
				driver.get("http://newtours.demoaut.com/");		
				
				System.out.println("Webpage title is"+ driver.getTitle());
				System.out.print("Test executed successfully!");
				driver.close();		
	}

}
