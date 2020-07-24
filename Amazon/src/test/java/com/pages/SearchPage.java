package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.common.BasePage;

public class SearchPage extends BasePage {
	public SearchPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "twotabsearchtextbox")
	private WebElement content;

	@FindBy(xpath=".//input[@type='submit' and @class='nav-input']")
	private WebElement clicksearch;
	
	@FindBy (xpath=".//span[contains(text(),'128GB Storage')]")
	private List<WebElement>storage;
	
	
	public void searchItem(String items) {
		try {
			String cover=items.trim();
			content.sendKeys(cover);
			Thread.sleep(1000);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickSearch()
	{
		try {
			clicksearch.click();
			Thread.sleep(2000);
			
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void get128StorageMobile()
	{
		try
		{
		int count=storage.size();
		//System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement mobilestorage=storage.get(i);
			String text=mobilestorage.getText();
		
			log.info(text);
		}
	}
		catch(Exception e )
		{
			e.printStackTrace();
		}
		
	}
}
