package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques19 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\eclipse\\\\Selenium\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement a=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		a.click();
		WebElement b=driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[4]"));
		WebElement c=driver.findElement(By.xpath("(//a[@title='Flats'])[1]"));
		Actions acc=new Actions(driver);
		acc.moveToElement(b).click(c).build().perform();

}}
