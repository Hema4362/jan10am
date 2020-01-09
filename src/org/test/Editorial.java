package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editorial {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\eclipse\\\\Selenium\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gettyimages.in/");
		WebElement editorial=driver.findElement(By.xpath("//a[@data-nav='nav_Editorial']"));
		editorial.click();
		WebElement entertainment=driver.findElement(By.xpath("//a[contains(text(),'Entertainment')]"));
		entertainment.click();
	}

}
