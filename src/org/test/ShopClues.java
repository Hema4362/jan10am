package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClues {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\eclipse\\\\Selenium\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		WebElement mobiles=driver.findElement(By.xpath("//a[contains(text(),'Mobiles & Electronics')]"));
		Actions acc=new Actions(driver);
		acc.moveToElement(mobiles).perform();
		Thread.sleep(3000);
		WebElement price=driver.findElement(By.xpath("(//a[@onclick='trackingData(this)'])[17]"));
		price.click();

}}
