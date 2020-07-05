package headless;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Htmlunitdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HtmlUnitDriver driver= new HtmlUnitDriver();
		driver.get("http://newtours.demoaut.com/");
		
		System.out.println("Title of the page is:"+driver.getTitle());
System.out.println("Current URL is:"+driver.getCurrentUrl());		
	}

}
