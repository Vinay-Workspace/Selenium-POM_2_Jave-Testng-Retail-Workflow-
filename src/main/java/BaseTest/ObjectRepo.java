package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import PageObjects.LoginPage;
import PageObjects.OrderCheckoutPage;
import PageObjects.HomePage;


public  class ObjectRepo {

	public static  WebDriverWait wait;
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;

	public static LoginPage LoginP;
	public static HomePage HomeP;
	public static OrderCheckoutPage OrderCheckP;

}
