package com.devlabs.java.lab7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork9January {

	static int max=0;

	static String version = null;
	
	public static void main(String[] args) {
//		Setup
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://devlabs-860f0.web.app/advanced-web-tables");	
		driver.manage().window().maximize();
		
//		Get table values
		 WebElement table = driver.findElement(By.className("mat-sort"));
		    
		    List<WebElement> rows = table.findElements(By.tagName("tr"));
		    
		    for (int i = 0; i < rows.size(); i++) {
		        WebElement eachRow = rows.get(i);
		        List<WebElement> cols = eachRow.findElements(By.tagName("td"));            
		            for (int j = 0; j < cols.size();j++) {
		    			System.out.println(cols.get(j).getText());
		    			
//		    			
//if (Integer.parseInt(cols.get(j).getText())) {
//	
//}
//		 for(int i=0; i<storeRows.size();i++){
//
//		 WebElement columnValue = storeRows.find
//
//		 WebElement versionElem = storeRows.findElement(By.xpath("\td[1]"));
//
//		 if(Integer.parseInt(columnValue.getText()) > max){
//
//		    version = versionElem .getText();
//		    max = Integer.parseInt(columnValue.getText());
//		     }
//
//		 }
//
//		 System.out.println("For Vrsion " + version + " are the highest downloads = " + max);			
////		        }
//		
	}

		    }
		    Object obj = Collections.max(all_elements_text);

		    System.out.println(obj);
	}
}
	
