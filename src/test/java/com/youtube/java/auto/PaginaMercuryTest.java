package com.youtube.java.auto;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PaginaMercuryTest {

	private WebDriver driver;
	//localizador por texto de link , en este caso el link se llama REgister
	By registerLinkLocator = By.linkText("REGISTER");
	//localizar por xpath la imagen
	By imgXpathLocator = By.xpath("//img [@src='images/mast_register.gif']"); 
	

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	//caso de prueba
	
	public void registerUser() throws InterruptedException {
		// 1 paso Abrir link
		//se hace uso del elemento buscandolo con el driver webelement y el nomber del elemento ya localizado
		//y  la accion es click
		driver.findElement(registerLinkLocator).click();
		// no recomendable pero es un timer de espera para esperar lo que tarda en abrir la pagina 2000 milisegundos = 2 segundos
		Thread.sleep(2000);
		//validar que la pagina muestre algun elemento , en este caso una imagen de un banner
		if(driver.findElement(imgXpathLocator).isDisplayed()) {
			//si si lo muestra, empiece a llenar campos , ejemplo
			//por nombre 
			driver.findElement(By.name("firstName")).sendKeys("ThisisTestNAme",Keys.TAB);
//			por xpath con su tag y nombre
			driver.findElement(By.xpath("//input [@name='lastName']")).sendKeys("ThisisTestLAstName",Keys.TAB);
//			por xpath que contenga el atributo nombre el nombre telefono
			driver.findElement(By.xpath("//input [contains(@name,'phone')]")).sendKeys("1234567891",Keys.TAB);
//			buscar un elemento por id
			driver.findElement(By.id("userName")).sendKeys("testemail@hotmail.com",Keys.TAB);
//			buscar de nuevo por nombre
			driver.findElement(By.name("address1")).sendKeys("TestDummyADdress", Keys.TAB);
//		    Ciudad
			driver.findElement(By.xpath("//input [@name='city']")).sendKeys("Aruba",Keys.TAB);
//			State
			driver.findElement(By.name("state")).sendKeys("Aruba",Keys.TAB);
//			Postal Code
			driver.findElement(By.name("postalCode")).sendKeys("123456890",Keys.TAB);
			
//			dropdown
			WebElement elementDropdown = driver.findElement(By.name("country"));
			Select dd = new Select(elementDropdown);
			dd.selectByValue("ANGOLA");
			
//			llenado user name
			driver.findElement(By.id("email")).sendKeys("testemail@homtail.com",Keys.TAB);
			
//			Password
			driver.findElement(By.name("password")).sendKeys("TestPassword",Keys.TAB);
			
//			Confirm Password
			driver.findElement(By.name("confirmPassword")).sendKeys("TestPassword");
			 
//			button
			driver.findElement(By.name("submit")).click();
		}
		else {
			System.out.println("No page displayed");
		};
	}

}
