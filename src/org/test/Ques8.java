package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\eclipse\\\\Selenium\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement courses=driver.findElement(By.className("activeLink"));
		WebElement oracle=driver.findElement(By.xpath("//span[contains(text(),'Oracle Training ')]"));
		WebElement sql=driver.findElement(By.xpath("//span[text()='Oracle SQL Training']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(courses).moveToElement(oracle).click(sql).build().perform();
		WebElement a=driver.findElement(By.xpath("//h1[contains(text(),'ORACLE')]"));
		String name=a.getText();
		System.out.println(name);

}}
