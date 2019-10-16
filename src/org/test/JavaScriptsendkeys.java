package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptsendkeys {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUNACHALAM\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\ARUN PROJECTS JAVA AND SELENIUM\\SELENIUM SCREEN SHOT\\Driver\\chromedriver.exe");
		
		WebDriver a=new ChromeDriver();
		
		a.get("https://www.facebook.com/");
        
		WebElement txtuser = a.findElement(By.id("email"));
		
		
		WebElement txtpass = a.findElement(By.name("pass"));
		
		
		WebElement txtlog = a.findElement(By.xpath("//input[@value='Log In']"));
        

		JavascriptExecutor j=(JavascriptExecutor)a;
		
		j.executeScript("arguments[0].setAttribute('value','9789814217')", txtuser);
		
		j.executeScript("arguments[0].setAttribute('value','devipriya')", txtpass);
		
		j.executeScript("arguments[0].click()", txtlog);
		
	}

}
