package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques62 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\eclipse\\\\Selenium\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/webhp");
		WebElement app=driver.findElement(By.xpath("//a[@class='gb_D gb_oc']"));
		app.click();
		WebElement gmail=driver.findElement(By.id("gb23"));
		gmail.click();

}}
