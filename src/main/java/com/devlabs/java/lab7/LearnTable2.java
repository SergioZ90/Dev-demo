package com.devlabs.java.lab7;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTable2 {

	public static void main(String[] args) {
//		Setup
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://devlabs-860f0.web.app/table");	
		driver.manage().window().maximize();
		
//	    // 1. Find the table element
//	    WebElement elementTable = driver.findElement(By.id("table"));
//	    
//	    // 2. Finding the number of rows in the table
//	    List<WebElement> elementRows = elementTable.findElements(By.tagName("tr"));
//	    System.out.println(elementRows.size());
//	    
//	    // 3. Iterate over the rows and find the table data in them
//	    for (int i = 1; i < elementRows.size(); i++) {
//	        
//	        // 4. Getting each row for each Iteration
//	        WebElement eachRow = elementRows.get(i);
//	        
//	        // 5. Getting all the cols from the row
//	        List<WebElement> elementCols = eachRow.findElements(By.tagName("td"));
//	        
//	        // 6. Iterating over the cols for retrieving data
//	        for (int j = 0; j < elementCols.size(); j++) {
//	            WebElement element = elementCols.get(j);
//	            System.out.println(element.getText());
//	        }
//		}
//			
//		}
	
		// 1. Find the table element
	    WebElement elementTable = driver.findElement(By.id("table"));
	    
	    // 2. Finding the number of rows in the table
	    List<WebElement> elementRows = elementTable.findElements(By.tagName("tr"));
	    System.out.println(elementRows.size());
	    
	    // 3. Iterate over the rows and find the table data in them
	    for (int i = 1; i < elementRows.size(); i++) {
	        
	        // 4. Getting each row for each Iteration
	        WebElement eachRow = elementRows.get(i);
	        
	        // 5. Getting all the cols from the row
	        List<WebElement> elementCols = eachRow.findElements(By.tagName("td"));
	        
	        // 6. Iterating over the cols for retrieving data
	        for (int j = 0; j < elementCols.size(); j++) {
	            WebElement element = elementCols.get(j);
	            System.out.println(element.getText());
	        }
	    }
	}
	


