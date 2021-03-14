package com.devlabs.java.lab6;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LearnDropdown {
public static void main(String[] args) {

	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

ChromeDriver driver = new ChromeDriver();
driver.get("https://devlabs-860f0.web.app/dropdown");

driver.manage().window().maximize();

WebElement elementDropdown = driver.findElement(By.id("Index"));
//Type 1 selection of dropdown
elementDropdown.sendKeys("Mango");


//Type 2 selection of dropdown
//creating and showing dropdown

Select dd = new Select(elementDropdown);
//Select using index
dd.selectByIndex(0);

//Select using by text
dd.selectByVisibleText("Orange");

//select using value depends on select
dd.selectByValue("1");

dd.deselectAll();
//dd.getOptions();/// get all the options of the dropdown

List<WebElement> options = dd.getOptions();
System.out.println("Size of dropdown"+ options.size());
for (WebElement eachoption : options) {
System.out.println("Select your favorite food");	
}

}

}
