package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUNACHALAM\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\ARUN PROJECTS JAVA AND SELENIUM\\SELENIUM SCREEN SHOT\\Driver\\chromedriver.exe");
		
		WebDriver a=new ChromeDriver();
		
		a.get("http://www.greenstechnologys.com/");
        
		TakesScreenshot tk=(TakesScreenshot)a;
		File src = tk.getScreenshotAs(OutputType.FILE);
		
		File desc=new File("C:\\Users\\ARUNACHALAM\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\ARUN PROJECTS JAVA AND SELENIUM\\SELENIUM SCREEN SHOT\\arun\\First.png");
		
		FileUtils.copyFile(src, desc);
	}

}
