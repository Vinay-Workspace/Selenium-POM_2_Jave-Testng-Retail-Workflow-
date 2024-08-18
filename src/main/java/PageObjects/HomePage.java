package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BaseLine;

public class HomePage extends BaseLine {


   @FindBy(xpath="//input[@type='checkbox']")
   public WebElement CheckHuman;

	@FindBy(linkText=("Log in"))
	public WebElement loginlink;

	@FindBy(xpath="//a[@class='ico-register']")
	public WebElement Register;


	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
	public WebElement Computerslink;

	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
	public WebElement Electronicslink;
	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")
	public WebElement Apparellink;
	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']")
	public WebElement GiftCardslink;




	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void CheckHuman() {
		CheckHuman.click();
	}

	public void loginlink() {
		loginlink.click();
	}

	public void Register() {
		Register.click();
	}
	public void Computerslink() {
		Computerslink.click();
	}
	public void Electronicslink() {
		Electronicslink.click();
	}
	public void Apparellink() {
		Apparellink.click();
	}
	public void GiftCardslink() {
		GiftCardslink.click();
	}


}
