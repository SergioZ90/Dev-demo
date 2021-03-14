package com.devlabs.java.lab7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcerciseTable {

	
public static void main(String[] args) {
	
//	Setup
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://erail.in/");	
	driver.manage().window().maximize();
	
//Implicit wait
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); //15 seconds to 20 seconds usually
	
	
    WebElement from = driver.findElement(By.id("txtStationFrom"));
    from.clear();
    from.sendKeys("MDU",Keys.TAB);
    
    WebElement to = driver.findElement(By.id("txtStationTo"));
    to.clear();
    to.sendKeys("MS",Keys.TAB);
    
    driver.findElement(By.id("chkSelectDateOnly")).click();
    
    WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
    
    List<WebElement> rows = table.findElements(By.tagName("tr"));
    
    for (int i = 0; i < rows.size(); i++) {
        WebElement eachRow = rows.get(i);
        List<WebElement> cols = eachRow.findElements(By.tagName("td"));
//        if(!cols.get(1).getText().startsWith("M")) {
//            System.out.println(cols.get(1).getText()+"->"+cols.get(0).getText());
//        }
        if(!cols.get(1).getText().contains("MS")) {
            System.out.println(cols.get(1).getText()+"->"+cols.get(0).getText());
        }
    }
	
////	From textbox
//	
//	driver.findElement(By.id("txtStationFrom")).clear();
//	driver.findElement(By.id("txtStationFrom")).sendKeys("MS",Keys.TAB);
//	
////	To textbox
//	driver.findElement(By.id("txtStationTo")).clear();
//	driver.findElement(By.id("txtStationTo")).sendKeys("TPJ", Keys.TAB);
//	
//	
//	WebElement checkBox = driver.findElement(By.id("chkSelectDateOnly"));
//	if (checkBox.isSelected()) {
//		System.out.println("Was already check");	
//	}
//	else {
//		checkBox.click();
//	}
//	
//
//	
////
//    WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
//    	
//    List<WebElement> Rows = table.findElements(By.tagName("tr"));
////	
//	   for (int i = 0; i < Rows.size(); i++) {
//           WebElement eachRow = Rows.get(i);
//           List<WebElement> cols = eachRow.findElements(By.tagName("td"));
//           if(!cols.get(1).getText().startsWith("M")) {
//               System.out.println(cols.get(1).getText()+"->"+cols.get(0).getText());
//           }
//	}
	
}
}
