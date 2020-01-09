package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques16 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\eclipse\\\\Selenium\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement sign=driver.findElement(By.id("nav-link-accountList"));
		WebElement start=driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(sign).click(start).build().perform();

}}
