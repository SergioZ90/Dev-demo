package preAndPostServceNow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ServiceNowBase {

	protected static RemoteWebDriver driver;
	@Parameters({"url", "browser"})
	@BeforeMethod
	public void startApp(String applicationUrl, String browser){
		System.out.println("browser name: "+browser);
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					"./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		default:
			System.err.println("Choose correct "+ browser);
			break;
		}
		System.out.println("Driver is launching with chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(applicationUrl);
	}
	@AfterMethod
	public void tearDown() {
		System.out.println("Driver is closed");
		driver.quit();	
	}

}