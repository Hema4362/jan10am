package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Shop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\eclipse\\\\Selenium\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		WebElement sports=driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[23]"));
		Actions a= new Actions(driver);
		a.moveToElement(sports).perform();
	    Thread.sleep(3000);
		WebElement weightGainers=driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		weightGainers.click();
		 Thread.sleep(3000);
		WebElement s=driver.findElement(By.xpath("(//div[@class='img_section img_280'])[1]"));
		s.click();
		WebElement c=driver.findElement(By.id("add_cart"));
		c.click();
		WebElement q=driver.findElement(By.className("qCart"));
		q.click();
		String total=q.getAttribute("gd_total");
		System.out.println(total);
				
		
}}
