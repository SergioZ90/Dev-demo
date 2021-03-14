package com.devlabs.java.lab8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class LearnActions {

	public static void main(String[] args) {
//		Setup
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://devlabs-860f0.web.app/aui");	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//First element
//		Finding object
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.id("draggable"));
		
//		finding drop point
		WebElement target = driver.findElement(By.id("droppable"));
		
//		creating object for actions
		
		Actions builder = new Actions(driver);
		
		builder.keyDown(Keys.CONTROL).dragAndDrop(element,target).perform();
		
//		Second element
		
		
		
	//		Third Element
			WebElement sTable1 = driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee ui-selected']"));
			WebElement sTable2 = driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee ui-selected']"));
			WebElement sTable3 = driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee ui-selected']"));
			WebElement sTable4 = driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee ui-selected']"));
			
			
			   builder.keyDown(Keys.CONTROL)
		        .click(sTable1)
		        .click(sTable2)
		        .click(sTable3)
		        .click(sTable4)
		        .keyUp(Keys.CONTROL)
		        .perform();
			
		}
}
