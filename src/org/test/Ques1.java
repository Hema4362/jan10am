package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\eclipse\\\\Selenium\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement src=driver.findElement(By.id("fourth"));
		WebElement dest=driver.findElement(By.id("amt7"));
		WebElement src1=driver.findElement(By.id("credit2"));
		WebElement dest1=driver.findElement(By.id("bank"));
		WebElement src2=driver.findElement(By.id("fourth"));
		WebElement dest2=driver.findElement(By.id("amt8"));
		WebElement src3=driver.findElement(By.id("credit1"));
		WebElement dest3=driver.findElement(By.id("loan"));
		Actions acc=new Actions(driver);
		acc.dragAndDrop(src, dest).dragAndDrop(src1,dest1).dragAndDrop(src2,dest2).dragAndDrop(src3,dest3).build().perform();
		

}}
