package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUNACHALAM\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\ARUN PROJECTS JAVA AND SELENIUM\\SELENIUM SCREEN SHOT\\Driver\\chromedriver.exe");
		
		WebDriver a=new ChromeDriver();
		
		a.get("https://www.facebook.com");
	
		WebElement mon = a.findElement(By.id("month"));
		Select b=new Select(mon);
		b.selectByValue("3");
		
		List<WebElement> op = b.getOptions();
		for (int i = 0; i < op.size(); i++) {
			 WebElement txt = op.get(i);
			 System.out.println(txt.getText());
			 
		}
			 
		for (WebElement x : op) {
			String txt2 = x.getAttribute("value");
			System.out.println(txt2);
			
		}	 
			 
			 
		}
	}


