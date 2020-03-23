package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[2]/a")
	WebElement linkAddNewCustomer;
	
	@FindBy(how = How.NAME, using ="name")
	WebElement textCustomerName;
	
	@FindBy(how = How.NAME, using ="rad1")
	WebElement radiobuttonGender;
	
	@FindBy(how = How.ID_OR_NAME, using ="dob")
	WebElement textDateOfBirth;
	
	@FindBy(how = How.NAME, using ="addr")
	WebElement textAddress;
	
	@FindBy(how = How.NAME, using ="city")
	WebElement textCity;
	
	@FindBy(how = How.NAME, using ="state")
	WebElement textState;
	
	@FindBy(how = How.NAME, using ="pinno")
	WebElement textPin;
	
	@FindBy(how = How.NAME, using ="telephoneno")
	WebElement textMobileNumber;
	
	@FindBy(how = How.NAME, using ="emailid")
	WebElement textEmail;
	
	@FindBy(how = How.NAME, using ="password")
	WebElement textPassword;
	
	@FindBy(how = How.NAME, using ="sub")
	WebElement buttonSubmit;
	
	@FindBy(how = How.NAME, using ="res")
	WebElement buttonReset;
	
	public void clickAddNewCustomer()
	{
		linkAddNewCustomer.click();
	}

	public void custName(String cname)
	{
		textCustomerName.sendKeys(cname);
	}
	
	public void custgender(String cgender)
	{
	   radiobuttonGender.sendKeys(cgender);	
	}
	
	public void custDOB(String mm, String dd, String yy)
	{
	  textDateOfBirth.sendKeys(mm);	
	  textDateOfBirth.sendKeys(dd);	
	  textDateOfBirth.sendKeys(yy);	
	}
	
	public void custAddress(String caddress)
	{
		textAddress.sendKeys(caddress);
	}
	
	public void custCity(String ccity)
	{
		textCity.sendKeys(ccity);
	}
	
	public void custState(String cstate)
	{
		textState.sendKeys(cstate);
	}
	
	public void custPin(String cpin)
	{
		textPin.sendKeys(cpin);
	}
	
	public void custMobileNumber(String cnumber)
	{
		textMobileNumber.sendKeys(cnumber);
	}
	
	public void custEmail(String cemail)
	{
		textEmail.sendKeys(cemail);
	}
	
	public void custPassword(String cpassword)
	{
		textPassword.sendKeys(cpassword);
	}
	
	public void clickSubmit()
	{
		buttonSubmit.click();
	}
	
	public void clickReset()
	{
		buttonReset.click();
	}
}
