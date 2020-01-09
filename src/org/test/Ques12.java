package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\eclipse\\Selenium\\driver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		
		WebElement all=driver.findElement(By.xpath("(//a[@data-id='departmentsFlyout'])[1]"));
		WebElement heating=driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
		WebElement air=driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
		WebElement portable=driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(all).moveToElement(heating).moveToElement(air).click(portable).build().perform();

}}
