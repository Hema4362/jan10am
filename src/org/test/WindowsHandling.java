package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\eclipse\\\\Selenium\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement search = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		search.sendKeys("iphone 11");
		WebElement enter = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		enter.click();
		Thread.sleep(2000);
		WebElement phone = driver.findElement(By.xpath("(//p[@class='product-title'])[1]"));
		phone.click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> all2 = driver.getWindowHandles();
		System.out.println(all2);
		List<String> li=new ArrayList<String>();
		li.addAll(all2);
		driver.switchTo().window(li.get(1));
		WebElement cart = driver.findElement(By.xpath("//span[text()='add to cart']"));
		cart.click();
		Thread.sleep(2000);
		WebElement pay = driver.findElement(By.xpath("(//span[@class='price'])[2]"));
		String text = pay.getText();
		System.out.println(text);
		
		
		
		}
		
		
		
		

}
