package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUNACHALAM\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\ARUN PROJECTS JAVA AND SELENIUM\\SELENIUM SCREEN SHOT\\Driver\\chromedriver.exe");
	    
		WebDriver a=new ChromeDriver();
		
		a.get("http://demo.guru99.com/test/guru99home/");
		
		TakesScreenshot tk=(TakesScreenshot)a;
		
		File srshot = tk.getScreenshotAs(OutputType.FILE);
		
		File des=new File("C:\\Users\\ARUNACHALAM\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\ARUN PROJECTS JAVA AND SELENIUM\\SELENIUM SCREEN SHOT\\arun//second.png");
		
		FileUtils.copyFile(srshot, des);
	
	  	
		WebElement txt = a.findElement(By.id("a077aa5e"));
		a.switchTo().frame(txt);
		
		WebElement txtclk = a.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		txtclk.click();
		
		
		
		
		
		
	}

}
