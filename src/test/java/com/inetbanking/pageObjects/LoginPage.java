package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	WebElement textUsername;
	
	@FindBy(name="password")
	WebElement textPassword;
	
	@FindBy(name="btnLogin")
	WebElement buttonLogin;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	WebElement linkLogout;
	
	public void setUsername(String username)
	{
		textUsername.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		textPassword.sendKeys(password);
	}
	
	public void clickLogin()
	{
		buttonLogin.click();	
	}
	
	public void clickLogout()
	{
		linkLogout.click();	
	}
	

}
