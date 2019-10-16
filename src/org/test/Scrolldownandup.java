package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldownandup {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUNACHALAM\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\ARUN PROJECTS JAVA AND SELENIUM\\SELENIUM SCREEN SHOT\\Driver\\chromedriver.exe");
		
		WebDriver a=new ChromeDriver();
		
		a.get("http://www.greenstech.in/selenium-course-content.html");
	   
		WebElement txt = a.findElement(By.xpath("//p[contains(text(),'Greens technology’s')]"));
		System.out.println(txt.getText());
		
		WebElement txtdwn = a.findElement(By.xpath("//p[text()='Framework Test Papers']"));
		
		WebElement txtup = a.findElement(By.xpath("//p[text()='Job Openings']"));
		
		JavascriptExecutor tk=(JavascriptExecutor)a;
		
		tk.executeScript("arguments[0].scrollIntoView(true)", txtdwn);
		
		Thread.sleep(2000);
		
		tk.executeScript("arguments[0].scrollIntoView(false)", txtup);
	}
}
