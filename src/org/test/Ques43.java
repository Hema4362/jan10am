package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques43 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\eclipse\\\\Selenium\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		WebElement a=driver.findElement(By.xpath("//p[contains(text(),'Greens Technology,')]"));
		String name=a.getText();
		System.out.println(name);
		WebElement b=driver.findElement(By.xpath("//p[contains(text(),' Learn ')]"));
		String name1=b.getText();
		System.out.println(name1);

}}
