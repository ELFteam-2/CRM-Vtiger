package com.vtigerv2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditingSalesPage {
	@FindBy(xpath="//textarea[@name='ship_street']")
	private WebElement shippingAddresstxtbox;
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement savebtn;
	public WebElement getSavebtn() {
		return savebtn;
	}
	public 	EditingSalesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getShippingAddresstxtbox() {
		return shippingAddresstxtbox;
	}
	
}
