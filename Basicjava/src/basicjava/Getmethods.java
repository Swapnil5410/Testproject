package basicjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\Eclipse setup files\\Eclipse\\Workspace\\Basicjava\\Chromedriver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("http://newtours.demoaut.com/");
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());

String Textboxlabel = driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/font")).getText();
System.out.println(Textboxlabel);

driver.close();

//System.out.print("The program is executed successfully");
	}

}
