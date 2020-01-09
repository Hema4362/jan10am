package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\eclipse\\\\Selenium\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement courses=driver.findElement(By.className("activeLink"));
		WebElement web=driver.findElement(By.xpath("//span[text()='Web Designing Training']"));
		WebElement java=driver.findElement(By.xpath("//span[text()='JavaScript Training']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(courses).moveToElement(web).click(java).build().perform();

}}
