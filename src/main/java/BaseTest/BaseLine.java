package BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import PageObjects.LoginPage;
import PageObjects.OrderCheckoutPage;
import PageObjects.HomePage;
import Reusable.PropertiesOperation;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLine extends ObjectRepo{

	public static WebDriver driver;

	@BeforeMethod
	public void LaunchBrowserAndLogin () throws Exception {
		String browser = PropertiesOperation.getPropertiesValueByKey("browser");
		String Url = PropertiesOperation.getPropertiesValueByKey("Url"); 
		Thread.sleep(5000);
		// String UserName = PropertiesOperation.getPropertiesValueByKey("UserName"); 
		// String Password = PropertiesOperation.getPropertiesValueByKey("Password"); // reading a from config

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	
	// Set implicit wait
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    // Maximize the browser window
    driver.manage().window().maximize();

    // Navigate to the URL
    driver.get("https://demo.nopcommerce.com/");
}
	
	@BeforeMethod
	public void setupMethod() throws Exception{
		LaunchBrowserAndLogin();	
		LoginP = new LoginPage();
		HomeP = new HomePage();
		OrderCheckP = new OrderCheckoutPage();
	}

	
	@AfterMethod
	public void cleanUp(){
		driver.quit();	
	}
}
