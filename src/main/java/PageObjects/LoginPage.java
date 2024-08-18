package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BaseLine;

public class LoginPage extends BaseLine {



	@FindBy(xpath="//input[@id='Email']")
	public WebElement Email;

	@FindBy(xpath="//input[@id='Password']")
	public WebElement Password;


	@FindBy(xpath="//button[normalize-space()='Log in']")
	public WebElement Loginbtn;

	@FindBy(xpath="//div[@class='message-error validation-summary-errors']")
	public WebElement Alertmessage;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}


	public void Email() {
		Email.click();
	}

	public void Password() {
		Password.click();
	}
	public void Login() {
		Loginbtn.click();
	}
	public void Alert() {
		Alertmessage.click();
	}

}
