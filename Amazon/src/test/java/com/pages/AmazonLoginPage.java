package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.common.BasePage;



public class AmazonLoginPage extends BasePage

{
	public AmazonLoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ".//span[contains(text(),'Hello, Sign in')]")
	private WebElement log;

	@FindBy (id="ap_email")
	private WebElement username;
	
	@FindBy(id="continue")
	private WebElement continuebutton;
	
	
	@FindBy(id="ap_password")
	private WebElement password;
		
	@FindBy (id="signInSubmit")
	private WebElement sign;
	
	@FindBy (xpath=".//*[contains(text(),'There was a problem')]")
	private WebElement loginfailsmessage;
	
	public void ClickOnLoginButton()
	{
		try 
		{
			log.click();
			Thread.sleep(2000);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
	}
}
	
	public void setUserName(String mailid)
	{
		try
		{
			username.sendKeys(mailid);
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void clickOnContinue()
	{
		try
		{
			continuebutton.click();
			Thread.sleep(2000);
			}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void setPassword(String pass)
	{
		try
		{
			password.sendKeys(pass);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void clickSign()
	{
		try
		{
			sign.click();
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}