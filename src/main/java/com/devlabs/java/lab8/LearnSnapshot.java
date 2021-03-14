package com.devlabs.java.lab8;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnSnapshot {
public static void main(String[] args) throws IOException {
//	Setup
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://devlabs-860f0.web.app/aui");	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//First element
//	Finding object
	
	WebElement element = driver.findElement(By.id("draggable"));
	
//	finding drop point
	WebElement target = driver.findElement(By.id("droppable"));
	
//	creating object for actions
	
	Actions builder = new Actions(driver);
	
	builder.keyDown(Keys.CONTROL).dragAndDrop(element,target).perform();
	File  temp = driver.getScreenshotAs(OutputType.FILE);
//	creating empty image file
	
	File img = new File("./snaps/img001.png");

//paste clipboard file in the created image
	
	// 1st tipe of action    / where to save the image / action
	FileUtils.copyFile(temp,img);
	
	
//	Element snap //target is reffering to the element driver.findElement(By.id("droppable"));
	File  temp1 = target.getScreenshotAs(OutputType.FILE);
//	creating empty image file
	
	File img1 = new File("./snaps/img002.png");

//paste clipboard file in the created image
	
	// 1st tipe of action    / where to save the image / action
	FileUtils.copyFile(temp1,img1);
	
	
	
	
}
}
