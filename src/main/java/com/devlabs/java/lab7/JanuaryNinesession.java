package com.devlabs.java.lab7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JanuaryNinesession {
	
	private WebDriver driver;
	private WebElement wb;
	
public static void main(String[] args) {
	
//	Setup
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://devlabs-860f0.web.app/table");	
	driver.manage().window().maximize();
	
//	finding tableelement
	WebElement elementTable = driver.findElement(By.id("table"));
//	find elements inside the table
	List<WebElement> elementRows = elementTable.findElements(By.tagName("tr"));
	
	System.out.println("No of Rows:  "+elementRows.size());
	
//	Iterating over the list of rows to get each out it
	
	for (int i = 0; i < elementRows.size(); i++) {
		
//		Getting each row out of the list
		
		WebElement eachRow = elementRows.get(i);
//	Getting columns each row
		List<WebElement> elementColumns = eachRow.findElements(By.tagName("td"));
		for (int j = 0; j < elementColumns.size();j++) {
			System.out.println(elementColumns.get(j).getText());
		}
	}
	
}
}
