package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques13 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\eclipse\\Selenium\\driver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		WebElement a=driver.findElement(By.xpath("(//a[@data-id='departmentsFlyout'])[1]"));
		Actions acc=new Actions(driver);
		acc.moveToElement(a).perform();

}}
