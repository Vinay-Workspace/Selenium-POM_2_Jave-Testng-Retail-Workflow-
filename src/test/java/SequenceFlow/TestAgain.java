package SequenceFlow;

import org.testng.annotations.Test;

import BaseTest.BaseLine;

public class TestAgain extends BaseLine {
	
	@Test
	public void launch() throws Exception {
		LaunchBrowserAndLogin();
		Thread.sleep(5000);
		HomeP.CheckHuman.click();
		
		System.out.println(driver.getTitle());

	}
	@Test
	public void Home() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());

	}

}
