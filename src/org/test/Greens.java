package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Greens {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\eclipse\\\\Selenium\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		
		WebElement a=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		a.sendKeys("Chennai");
		
	    WebElement b= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	   b.sendKeys("Nellore");
	 
			WebElement h=driver.findElement(By.xpath("//select[@id='trainClass']"));
			Select z=new Select(h);
			z.selectByVisibleText("AC First Class (1A)");
			WebElement i=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
			i.sendKeys("31/12/2019");
			WebElement j=driver.findElement(By.xpath("(//select[@class='span span24'])[1]"));
			Select s1=new Select(j);
			s1.selectByVisibleText("1");
			WebElement k=driver.findElement(By.xpath("(//select[@class='span span24'])[2]"));
			Select s2=new Select(k);
			s2.selectByVisibleText("0");
			WebElement l=driver.findElement(By.xpath("(//select[@class='span span24'])[3]"));
			Select s3=new Select(l);
			s3.selectByVisibleText("0");
			WebElement m=driver.findElement(By.xpath("(//select[@class='span span24'])[4]"));
			Select s4=new Select(m);
			s4.selectByVisibleText("0");
			WebElement n=driver.findElement(By.xpath("//button[@id='trainFormButton']"));
			
			n.click();

}}
