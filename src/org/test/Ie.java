package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ie {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Sai\\eclipse\\Selenium\\drivers\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.greenstechnologys.com/");
		Thread.sleep(3000);
		driver.get("http://demo.automationtesting.in/Register.html");
		String title1=driver.getTitle();
		System.out.println(title1);
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		String title3=driver.getTitle();
		System.out.println(title3);
	}

}
