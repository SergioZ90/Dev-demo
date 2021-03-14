package com.devlabs.java.lab7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDWait {
	public static void main(String[] args) {
		
//		Setup
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");	
		driver.manage().window().maximize();
		
	//Implicit wait
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); //15 seconds to 20 seconds usually
		
		
//		Creating obj for webdriver wait class ->one time
		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.visibilityOf(elements))
		
	    }
}
