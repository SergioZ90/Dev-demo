package com.devlabs.java.lab8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {
public static void main(String[] args) {
//	Setup
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://devlabs-860f0.web.app/alert");	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//First element
//	Finding object
	driver.findElement(By.id("aswdefr")).click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	
	alert.sendKeys("Devlabs");
	alert.accept();
	
}
}
