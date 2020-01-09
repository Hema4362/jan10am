package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\eclipse\\\\Selenium\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement courses=driver.findElement(By.className("activeLink"));
		WebElement data=driver.findElement(By.xpath("//span[text()='Data Warehousing Training ']"));
		WebElement micro=driver.findElement(By.xpath("//span[text()='Microstrategy Training']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(courses).moveToElement(data).click(micro).build().perform();

}}
