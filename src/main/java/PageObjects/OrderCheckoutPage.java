package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseTest.BaseLine;

public class OrderCheckoutPage extends BaseLine {


	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")
	public WebElement Booklink;

	//Add book in cart
	@FindBy(xpath="//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]")
	public WebElement FahrenheitBook;

	@FindBy(xpath="//div[@class='products-wrapper']//div[2]//div[1]//div[2]//div[3]//div[2]//button[1]")
	public WebElement FirstPiesBook;

	@FindBy(xpath="//div[@class='center-2']//div[3]//div[1]//div[2]//div[3]//div[2]//button[1]")
	public WebElement PridePrejudiceBook;

	//move to shopping cart

	@FindBy(xpath="//span[@class='cart-label']")
	public WebElement ShoppingCart;


	@FindBy(xpath="//input[@id='termsofservice']")
	public WebElement Checkbox;

	@FindBy(xpath="//button[@id='checkout']")
	public WebElement CheckOut;

	@FindBy(xpath="//button[normalize-space()='Checkout as Guest']")
	public WebElement CheckOutasguest;

	//Checkout >>Billing address>>Shipping address>>shipping Method>>payment method>>payment info>>confirmOrder

	@FindBy(xpath="//input[@id='BillingNewAddress_FirstName']")
	public WebElement BNAFirstName;

	@FindBy(xpath="//input[@id='BillingNewAddress_LastName']")
	public WebElement BNALastName;

	@FindBy(xpath="//input[@id='BillingNewAddress_Email']")
	public WebElement BNANewAddress_Email;

	@FindBy(xpath="//input[@id='BillingNewAddress_Company']")
	public WebElement BNANewAddress_Company;

	@FindBy(xpath="//select[@id='BillingNewAddress_CountryId']") //handling a Dropdown
	public WebElement BNACountryId;

	@FindBy(xpath="//input[@id='BillingNewAddress_City']")
	public WebElement BNACity;

	@FindBy(xpath="//input[@id='BillingNewAddress_Address1']")
	public WebElement BNAAddress;

	@FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")
	public WebElement BNAZip;

	@FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")
	public WebElement BNAPhonenumber;

	@FindBy(xpath="//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; Billing.save()']")
	public WebElement BillingSave;
	
	@FindBy(xpath="//input[@id='shippingoption_1']]")
	public WebElement NextDayAir;
	

	@FindBy(xpath="//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; Shipping.save()']")
	public WebElement ShippingSave;

	@FindBy(xpath="//button[@class='button-1 shipping-method-next-step-button']")
	public WebElement ShippingMethod;

	@FindBy(xpath="//button[@class='button-1 payment-method-next-step-button']")
	public WebElement PaymentMethod;

	@FindBy(xpath="//button[@class='button-1 payment-info-next-step-button']")
	public WebElement PaymentInfo;

	@FindBy(xpath="//button[normalize-space()='Confirm']")
	public WebElement Confirm;

	@FindBy(xpath="//button[normalize-space()='Continue']")
	public WebElement ContinueOrder;



	public OrderCheckoutPage() {
		PageFactory.initElements(driver, this);
	}


	public void Booklink() {
		Booklink.click();
	}

	public void FahrenheitBook() {
		FahrenheitBook.click();
	}

	public void FirstPiesBook() {
		FirstPiesBook.click();
	}

	public void PridePrejudiceBook() {
		PridePrejudiceBook.click();
	}

	public void ShoppingCart() {
		ShoppingCart.click();
	}

	public void Checkbox() {
		Checkbox.click();
	}

	public void CheckOut() {
		CheckOut.click();
	}

	public void CheckOutasguest() {
		CheckOutasguest.click();
	}

	public void BNAFirstName() {
		BNAFirstName.click();
	}

	public void BNALastName() {
		BNALastName.click();
	}

	public void BNANewAddress_Email() {
		BNANewAddress_Email.click();
	}

	public void BNANewAddress_Company() {
		BNANewAddress_Company.click();
	}

	public void BNACountryId() {
		Select dropdown = new Select(BNACountryId);  
		dropdown.selectByVisibleText("Albania");
	}


	public void BNACity() {
		BNACity.click();
	}

	public void BNAAddress() {
		BNAAddress.click();
	}

	public void BNAZip() {
		BNAZip.click();
	}

	public void BNAPhonenumber() {
		BNAPhonenumber.click();
	}

	public void BillingSave() {
		BillingSave.click();
	}
	public void NextDayAir() {
		NextDayAir.click();
	}

	public void ShippingSave() {
		ShippingSave.click();
	}

	public void ShippingMethod() {
		ShippingMethod.click();
	}

	public void PaymentMethod() {
		PaymentMethod.click();
	}

	public void PaymentInfo() {
		PaymentInfo.click();
	}

	public void Confirm() {
		Confirm.click();
	}

	public void ContinueOrder() {
		ContinueOrder.click();
	}

//Your order has been successfully processed!--//strong[normalize-space()='Your order has been successfully processed!']
	////strong[normalize-space()='Order number: 1031'] for ordernumber

}



