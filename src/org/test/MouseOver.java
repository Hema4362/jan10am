package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\eclipse\\\\Selenium\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		WebElement a=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		a.click();
		WebElement home=driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(home).perform();
		WebElement chairs=driver.findElement(By.xpath("//a[text()='Dining Tables & Chairs']"));
		chairs.click();
		WebElement product=driver.findElement(By.xpath("//a[contains(text(),'Luzon Metal ')]"));
		product.click();
		WebElement add=driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		add.click();
		
	}

}
