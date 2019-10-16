package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSendkeys {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUNACHALAM\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\ARUN PROJECTS JAVA AND SELENIUM\\SELENIUM SCREEN SHOT\\Driver\\chromedriver.exe");
		
		WebDriver a=new ChromeDriver();
		
		a.get("https://www.facebook.com/");
        
		WebElement txtuser = a.findElement(By.id("email"));
		txtuser.sendKeys("9789814217");
		
		WebElement txtpass = a.findElement(By.name("pass"));
		txtpass.sendKeys("devipriya");
		
		WebElement txtlog = a.findElement(By.xpath("//input[@value='Log In']"));
        txtlog.click();
}
}