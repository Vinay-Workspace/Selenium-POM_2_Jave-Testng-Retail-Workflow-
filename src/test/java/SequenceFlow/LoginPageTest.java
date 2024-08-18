package SequenceFlow;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseLine;

public class LoginPageTest extends BaseLine {
	
	@Test
	public void login() {
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

}
