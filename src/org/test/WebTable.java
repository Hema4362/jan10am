package org.test;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\eclipse\\\\Selenium\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		for(int i=0;i<tRows.size();i++) {
			WebElement row = tRows.get(i);
			List<WebElement> tDatas = row.findElements(By.tagName("td"));
			for (int j = 0; j < tDatas.size(); j++) {
				WebElement data = tDatas.get(j);
				if(i==2) {
					String text = data.getText();
					System.out.println(text);
					
				}
				if(i==3) {
					String text = data.getText();
					System.out.println(text);
					
				}
				
		}
		

}}}
