package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screensht {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUNACHALAM\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\ARUN PROJECTS JAVA AND SELENIUM\\SELENIUM SCREEN SHOT\\Driver\\chromedriver.exe");
		
	WebDriver a=new ChromeDriver();
	
	a.get("http://www.greenstechnologys.com/");
	
	TakesScreenshot tk=(TakesScreenshot)a;
	
	File dtd = tk.getScreenshotAs(OutputType.FILE);
	
	File b=new File("C:\\Users\\ARUNACHALAM\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\ARUN PROJECTS JAVA AND SELENIUM\\SELENIUM SCREEN SHOT\\arun\\Third.png");
	
	FileUtils.copyFile(dtd, b);
	
	
		
		
	}

}
