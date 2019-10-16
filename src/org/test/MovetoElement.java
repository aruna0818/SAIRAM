package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElement {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUNACHALAM\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\ARUN PROJECTS JAVA AND SELENIUM\\SELENIUM SCREEN SHOT\\Driver\\chromedriver.exe");
		
		WebDriver a=new ChromeDriver();
		
		a.get("http://www.greenstech.in/selenium-course-content.html");
		
	   
		WebElement txbt = a.findElement(By.xpath("//a[text()='COURSES']"));
		Actions b=new Actions(a);
		b.moveToElement(txbt).perform();
		
		WebElement txtsrc = a.findElement(By.xpath("//span[text()='Oracle Training ']"));
		b.moveToElement(txtsrc).perform();
		
		WebElement txtdes = a.findElement(By.xpath("//span[text()='Oracle SQL Training']"));
		b.click().perform();
		
		
		
	}

}
