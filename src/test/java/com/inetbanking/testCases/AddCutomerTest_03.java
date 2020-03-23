package com.inetbanking.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

import junit.framework.Assert;

public class AddCutomerTest_03 extends BaseClass {
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickLogin();
		
		Thread.sleep(3000);
		
		AddCustomerPage addCustomerPage = new AddCustomerPage(driver);
		addCustomerPage.clickAddNewCustomer();
		addCustomerPage.custName("Rohit Jaykumar");
		addCustomerPage.custgender("male");
		addCustomerPage.custDOB("10", "08", "1990");
		Thread.sleep(3000);
		addCustomerPage.custAddress("Dhanori");
		addCustomerPage.custCity("HYD");
		addCustomerPage.custState("AP");
		addCustomerPage.custPin("5000074");
		addCustomerPage.custMobileNumber("8087587002");
		
		String email = randomestring()+"@gmail.com";
		
		addCustomerPage.custEmail(email);
		addCustomerPage.custPassword("xyzef");
		addCustomerPage.clickSubmit();
		
		Thread.sleep(3000);
		
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!"); 
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test case is passed");
		}
		
		else
		{
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
			logger.info("Test case is failed");
			
		}
	}
	
	
	
	

}
