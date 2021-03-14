package com.devlabs.java.lab6;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBasics {

	
public static void main(String[] args) {
	
	//chromedriver path
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	//chromedriver object creation
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://devlabs-860f0.web.app/edit");
	
	driver.manage().window().maximize();
	
	//to get title from browser
	String title = driver.getTitle();
	
		System.out.println(title);
		
		//to find and element and store it as webelement based on ID
//		WebElement elementFirstNameTextBox = driver.findElement(By.id("fullName"));
		
		// to find and Element based on Xpath
		WebElement elementNameXPath = driver.findElementByXPath("//input [@id = 'fullName']");
		
		//Type on a webelement
		

		
//		elementFirstNameTextBox.sendKeys("Devlabs");
		elementNameXPath.sendKeys("Devlabs");
		
	
		//Entering a keyboard key to the webpage
		driver.findElement(By.id("join")).sendKeys("Human being",Keys.TAB);
		
		WebElement lab = driver.findElementByXPath("//div[@class='card-body'])//label");
		System.out.println(lab);
		

		
		//clear the text inside the textfield
	//	elementFirstNameTextBox.clear();
			 
//		WebElement button = driver.findElement(By.id("Button"));
//		if (button.isDisplayed()) {
//			button.click();
//		}
//		else {
//			System.out.println("Button is not displayed");
//		}

//WebElement elementGrandParent = driver.findElementByXPath("//div[@class='card-body'])//label");

}

}
	
	

