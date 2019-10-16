package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DrpDwn {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUNACHALAM\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\ARUN PROJECTS JAVA AND SELENIUM\\SELENIUM SCREEN SHOT\\Driver\\chromedriver.exe");
		
		WebDriver a=new ChromeDriver();
		
		a.get("http://toolsqa.com/automation-practice-form/");
		
		WebElement txtbt = a.findElement(By.id("continentsmultiple"));
		Select b=new Select(txtbt);
		b.selectByValue("AS");
		b.selectByVisibleText("Africa");
		
		
		
		
		
		
		
		
	}

}
