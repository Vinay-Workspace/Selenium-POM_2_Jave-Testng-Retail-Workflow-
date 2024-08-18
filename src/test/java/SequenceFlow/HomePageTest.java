package SequenceFlow;

import org.testng.annotations.Test;
import BaseTest.BaseLine;

public class HomePageTest extends BaseLine {


	@Test
	public void launch() throws Exception {
		LaunchBrowserAndLogin();
		System.out.println(driver.getTitle());

	}
	@Test
	public void Home() {
		System.out.println(driver.getCurrentUrl());

	}
	@Test
	public void computer() {
		HomeP.Computerslink.click();
		System.out.println(driver.getCurrentUrl());
	}
	@Test
	public void Electronic() {
		HomeP.Electronicslink.click();
		System.out.println(driver.getCurrentUrl());
	}
	@Test
	public void Apparel() {
		HomeP.Apparellink.click();
		System.out.println(driver.getCurrentUrl());
	}	
	@Test
	public void GiftCard() {
		HomeP.GiftCardslink.click();
		System.out.println(driver.getCurrentUrl());
	}	
	@Test
	public void loginLink() {
		HomeP.loginlink.click();
		System.out.println(driver.getCurrentUrl());
	}

	@Test
	public void LoginPageTest() {
		String actualerrormessage;
		String Expectederrormessage ="Login was unsuccessful. Please correct the errors and try again.No customer account found";

		HomeP.loginlink.click();
		LoginP.Email.sendKeys("hopicient@gmail.com");
		LoginP.Password.sendKeys("Vidal321");
		LoginP.Loginbtn.click();
		//actualerrormessage=LoginP.Alertmessage.getText();
		//Assert.assertEquals(actualerrormessage, Expectederrormessage);
		System.out.println(driver.getCurrentUrl());
	}
	@Test
	public void EndToEndflowOrder()throws InterruptedException {

		OrderCheckP.Booklink.click();
		System.out.println(driver.getCurrentUrl());
		//Select the item
		OrderCheckP.FahrenheitBook.click();
		OrderCheckP.FirstPiesBook.click();
		OrderCheckP.PridePrejudiceBook.click();

		//Click on ShoppingCart click on checkout and select the terms & Condition

		OrderCheckP.ShoppingCart.click();
		OrderCheckP.Checkbox.click();
		OrderCheckP.CheckOut.click();
		Thread.sleep(1000);
		OrderCheckP.CheckOutasguest.click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);

		//Provide the billing and all details
		OrderCheckP.BNAFirstName.sendKeys("ABC");
		OrderCheckP.BNALastName.sendKeys("MARk");
		OrderCheckP.BNANewAddress_Email.sendKeys("Vidal@gmail.com");
		OrderCheckP.BNANewAddress_Company.sendKeys("Austin lane");
		Thread.sleep(1000);
		OrderCheckP.BNACountryId.sendKeys("BNACountryId");
		OrderCheckP.BNACity.sendKeys("Dallas");
		OrderCheckP.BNAAddress.sendKeys("Curzon lane");
		OrderCheckP.BNAZip.sendKeys("464574");
		OrderCheckP.BNAPhonenumber.sendKeys("5474568568");
		System.out.println(driver.getCurrentUrl());

		//Now save all info Billing ,Shipping ,ShippingMethod,Billing Method ,Billing Info
		OrderCheckP.BillingSave.click();
		Thread.sleep(10000);
		//OrderCheckP.NextDayAir.click();
		//OrderCheckP.ShippingSave.click();
		//Thread.sleep(10000);
		OrderCheckP.ShippingMethod.click();
		Thread.sleep(10000);
		OrderCheckP.PaymentMethod.click();
		Thread.sleep(10000);
		OrderCheckP.PaymentInfo.click();
		OrderCheckP.Confirm.click();
		Thread.sleep(10000);
		OrderCheckP.ContinueOrder.click();
		System.out.println(driver.getPageSource());

	}

}
