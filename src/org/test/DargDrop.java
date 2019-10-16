package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DargDrop {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUNACHALAM\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\ARUN PROJECTS JAVA AND SELENIUM\\SELENIUM SCREEN SHOT\\Driver\\chromedriver.exe");
		
		WebDriver a=new ChromeDriver();
		
		a.get("http://demo.guru99.com/test/drag_drop.html");
		
		Actions b=new Actions(a);
	   
		WebElement txdrg = a.findElement(By.id("credit2"));
		
		WebElement txget = a.findElement(By.id("bank"));
		b.dragAndDrop(txdrg, txget).perform();
		
		WebElement txtd = a.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		WebElement txttar = a.findElement(By.id("amt8"));
		b.dragAndDrop(txtd, txttar).perform();
		
	}

}
